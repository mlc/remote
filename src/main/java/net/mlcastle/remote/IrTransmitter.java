package net.mlcastle.remote;

import android.hardware.ConsumerIrManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IrTransmitter {
    public static final String TAG = "IrTransmitter";
    public static final long INTER_CODE_DELAY = 200L; // ms

    private final ConsumerIrManager irManager;
    private final ConsumerIrManager.CarrierFrequencyRange[] ranges;

    public IrTransmitter(ConsumerIrManager irManager) {
        this.irManager = irManager;
        ranges = irManager.getCarrierFrequencies();
    }

    private static int better(int target, int currentBest, int candidate) {
        if ((currentBest == 0) || (Math.abs(target - candidate) < Math.abs(target - currentBest)))
            return candidate;
        else
            return currentBest;
    }

    /**
     * Given a target carrier frequency, returns the closest frequency that our
     * IR manager can transmit on.
     * @param target the target carrier frequency
     * @return <code>target</code> if it's in one of the <code>ranges</code>, the best available frequency otherwise
     * @throws net.mlcastle.remote.NoIrException <code>ranges.length == 0</code>
     */
    private int bestFrequency(int target) {
        if (ranges.length == 0)
            throw new NoIrException();

        int best = 0;
        for (ConsumerIrManager.CarrierFrequencyRange range : ranges) {
            int min = range.getMinFrequency(), max = range.getMaxFrequency();
            if (target >= min && target <= max) {
                return target; // can we do it exactly? okay.
            } else if (target < min) {
                best = better(target, best, min);
            } else { // target > max
                best = better(target, best, max);
            }
        }
        return best;
    }

    public void transmit(IrCode code) {
        int[] pattern = code.toPattern();
        int freq = bestFrequency(code.frequency);
        long start = SystemClock.elapsedRealtimeNanos(); // ns
        irManager.transmit(freq, pattern);
        long elapsed = SystemClock.elapsedRealtimeNanos() - start; // ns
        long remaining = code.duration() - TimeUnit.NANOSECONDS.toMicros(elapsed);  // µs
        long toSleep = TimeUnit.MICROSECONDS.toMillis(Math.max(0, remaining)) + INTER_CODE_DELAY; // ms
        Log.d(TAG, String.format("transmitting %s took %d ns, expected %d µs, will sleep %d ms", code.name, elapsed, code.duration(), toSleep));

        SystemClock.sleep(toSleep);
    }
}
