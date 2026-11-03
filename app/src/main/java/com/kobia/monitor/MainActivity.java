package com.kobia.monitor;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(1);
        layout.setPadding(28, 40, 28, 28);
        layout.setBackgroundColor(Color.rgb(15, 20, 35));

        TextView title = new TextView(this);
        title.setText("KOBIA MONITOR");
        title.setTextSize(27);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView status = new TextView(this);
        status.setText("\nDevice Dashboard\n\nSetup: Not connected\n\nLocation: Permission required\nCamera: Permission required\nMicrophone: Permission required\n\nMonitoring starts only after device consent.");
        status.setTextSize(17);
        status.setTextColor(Color.WHITE);
        layout.addView(status);

        setContentView(layout);
    }
}
