package org.iron_lab.devicemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GoproControl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gopro_control);
        // http://10.5.5.9/gp/gpControl/execute?p1=gpStream&c1=start
    }
}