package org.iron_lab.devicemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListDevices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_devices);
    }

    // UI Method
    public void useAndroid(View view){
        // Build our Intent
        Intent intent = new Intent(this, AndroidMedia.class);
        // Don't need to pass anything, just transition.
        startActivity(intent);
    }

    public void useGopro(View view){
        // Build our Intent
        Intent intent = new Intent(this, GoproControl.class);
        // Don't need to pass anything, just transition.
        startActivity(intent);
    }
}
