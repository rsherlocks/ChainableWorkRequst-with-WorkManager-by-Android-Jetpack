package com.example.androidshaper.workmanagerandroidjetpack;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class WorkA extends Worker {
    public String TAG="WorkA";
    public WorkA(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.e(TAG, "doWork: WorkA Finish");
        return Result.success();
    }
}
