package com.cocosw.lifecycle.app;

import android.os.Bundle;

import com.cocosw.lifecycle.LifecycleDispatcher;

/**
 * Project: AndroidLifeCycleCallback
 * Created by LiaoKai(soarcn) on 14-3-18.
 */
public class Activity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleDispatcher.get().onActivityCreated(this, savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LifecycleDispatcher.get().onActivityStarted(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        LifecycleDispatcher.get().onActivityResumed(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        LifecycleDispatcher.get().onActivityPaused(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        LifecycleDispatcher.get().onActivityStopped(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LifecycleDispatcher.get().onActivitySaveInstanceState(this, outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LifecycleDispatcher.get().onActivityDestroyed(this);
    }
}
