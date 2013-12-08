package net.mlcastle.remote;

import android.app.Activity;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.util.Log;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.btn_start)
    void onStartButton() {
        ConsumerIrManager mgr = (ConsumerIrManager) getSystemService(CONSUMER_IR_SERVICE);
        boolean hasIrEmitter = mgr.hasIrEmitter();
        Log.d(TAG, "has IR emitter: " + hasIrEmitter);
        if (hasIrEmitter) {
            for (ConsumerIrManager.CarrierFrequencyRange range : mgr.getCarrierFrequencies()) {
                Log.d(TAG, "frequency range: " + range.getMinFrequency() + " to " + range.getMaxFrequency());
            }
        }
    }
}
