package net.mlcastle.remote;

import android.hardware.ConsumerIrManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IrTransmitter {
    final ConsumerIrManager irManager;

    public IrTransmitter(ConsumerIrManager irManager) {
        this.irManager = irManager;
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
     * @param ranges a set of carrier frequency ranges
     * @return <code>target</code> if it's in one of the <code>ranges</code>, the best available frequency otherwise
     * @throws net.mlcastle.remote.NoIrException <code>ranges.length == 0</code>
     */
    private static int bestFrequency(int target, ConsumerIrManager.CarrierFrequencyRange[] ranges) {
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
        long now = SystemClock.elapsedRealtimeNanos();
        for (List<Integer> subpat : Lists.partition(Ints.asList(code.toPattern()), 16)) {
            irManager.transmit(code.frequency, Ints.toArray(subpat));
        }
        long dnow = SystemClock.elapsedRealtimeNanos() - now;
        Log.d("IrTransmitter", String.format("took %d µs, expected %d µs", TimeUnit.NANOSECONDS.toMicros(dnow), code.duration()));
    }
}
