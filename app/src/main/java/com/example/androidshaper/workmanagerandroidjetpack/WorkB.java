package com.example.androidshaper.workmanagerandroidjetpack;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class WorkB extends Worker {
    public String TAG="WorkB";
    public WorkB(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.e(TAG, "doWork: WorkB Start ");

        try {
            Thread.sleep(5000);
            Log.e(TAG, "doWork: WorkB Finish");
            return Result.success();

        } catch (InterruptedException e) {
            e.printStackTrace();
            return Result.failure();
        }

    }
}
