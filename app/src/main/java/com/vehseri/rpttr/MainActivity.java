package com.vehseri.rpttr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textLoginAs;
    Button buttonAsTeacher, buttonAsPupil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setButtonBehavior();
    }
    private void initViews() {
        textLoginAs = (TextView)findViewById(R.id.textLoginAs);
        buttonAsPupil = (Button)findViewById(R.id.buttonAsPupil);
        buttonAsTeacher = (Button)findViewById(R.id.buttonAsTeacher);
    }
    private void setButtonBehavior(){
        buttonAsPupil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        buttonAsTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
