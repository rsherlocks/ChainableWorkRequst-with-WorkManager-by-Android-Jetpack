package com.example.androidshaper.workmanagerandroidjetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OneTimeWorkRequest oneTimeWorkRequestA=  new OneTimeWorkRequest.Builder(WorkA.class).build();
        OneTimeWorkRequest oneTimeWorkRequestB=  new OneTimeWorkRequest.Builder(WorkB.class).build();
        OneTimeWorkRequest oneTimeWorkRequestC=  new OneTimeWorkRequest.Builder(WorkC.class).build();

//        WorkManager.getInstance().beginWith(oneTimeWorkRequestA)
//                .then(oneTimeWorkRequestB)
//                .then(oneTimeWorkRequestC)
//                .enqueue();
        WorkManager.getInstance(getApplicationContext())
                .beginWith(Arrays.asList(oneTimeWorkRequestA,oneTimeWorkRequestB))
                .then(oneTimeWorkRequestC)
                .enqueue();

    }

}