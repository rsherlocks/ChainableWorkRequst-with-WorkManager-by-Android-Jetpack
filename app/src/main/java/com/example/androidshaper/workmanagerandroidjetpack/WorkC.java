package com.example.androidshaper.workmanagerandroidjetpack;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class WorkC extends Worker {
    public String TAG="WorkC";
    public WorkC(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.e(TAG, "doWork: WorkC Finish");
        return Result.success();
    }
}
