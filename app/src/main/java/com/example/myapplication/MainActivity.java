package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        et = findViewById(R.id.et);
        btn = findViewById(R.id.btn);

        AppCenter.start(getApplication(), "69d5ac26-d773-4177-86dc-b27314c567a9",
                Analytics.class, Crashes.class);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tv.setText(et.getText().toString());
            }
        });
    }
}
