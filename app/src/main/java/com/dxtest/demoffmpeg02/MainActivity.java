package com.dxtest.demoffmpeg02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dxtest.mylibrary.JniFFmpegApplicaion;

public class MainActivity extends AppCompatActivity {

    JniFFmpegApplicaion mJniFFmpegApplicaion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mJniFFmpegApplicaion=new JniFFmpegApplicaion();
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(mJniFFmpegApplicaion.stringFromJNI());
    }


}
