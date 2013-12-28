package net.mlcastle.remote;

import android.app.Activity;
import android.content.SharedPreferences;
import android.hardware.ConsumerIrManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

import java.util.List;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    private static final String DEFAULT_REGION = "default_region";
    public static final int NORTH_AMERICA = 0, EUROPE = 1;

    @InjectView(R.id.region_group) RadioGroup regionGroup;
    @InjectView(R.id.region_na) RadioButton northAmerica;
    @InjectView(R.id.region_eu) RadioButton europe;
    int region;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        region = PreferenceManager.getDefaultSharedPreferences(this).getInt(DEFAULT_REGION, NORTH_AMERICA);
        regionGroup.check(region == NORTH_AMERICA ? R.id.region_na : R.id.region_eu);

        regionGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                onRegionChanged(checkedId);
            }
        });
    }

    @OnClick(R.id.btn_start)
    void onStartButton(final View button) {
        final ConsumerIrManager mgr = (ConsumerIrManager) getSystemService(CONSUMER_IR_SERVICE);
        boolean hasIrEmitter = mgr.hasIrEmitter();
        Log.d(TAG, "has IR emitter: " + hasIrEmitter);
        if (hasIrEmitter) {
            for (ConsumerIrManager.CarrierFrequencyRange range : mgr.getCarrierFrequencies()) {
                Log.d(TAG, "frequency range: " + range.getMinFrequency() + " to " + range.getMaxFrequency());
            }
        }
        final List<IrCode> codes = (region == NORTH_AMERICA) ? TvBGoneCodes.naCodes : TvBGoneCodes.euCodes;
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected void onPreExecute() {
                button.setEnabled(false);
            }

            @Override
            protected Void doInBackground(Void... params) {
                IrTransmitter trans = new IrTransmitter(mgr);
                for (IrCode code : codes) {
                    Log.d(TAG, "transmitting " + code.name);
                    trans.transmit(code);
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                button.setEnabled(true);
            }
        }.execute();
    }

    void onRegionChanged(int regionControlId) {
        region = (regionControlId == R.id.region_na ? NORTH_AMERICA : EUROPE);
        SharedPreferences.Editor ed = PreferenceManager.getDefaultSharedPreferences(this).edit();
        ed.putInt(DEFAULT_REGION, region);
        ed.apply();
    }
}
