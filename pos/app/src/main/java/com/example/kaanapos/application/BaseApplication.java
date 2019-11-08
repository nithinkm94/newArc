package com.example.kaanapos.application;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;

import com.example.kaanapos.utils.SharedPreferenceUtils;
import com.facebook.stetho.Stetho;

public class BaseApplication extends Application {

    private SharedPreferenceUtils mPreference;
    private Activity mCurrentActivity = null;
    private Dialog mCurrentDialog = null;
    @SuppressLint("StaticFieldLeak")
    private static BaseApplication uniqInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mPreference = new SharedPreferenceUtils(this);

        Stetho.initializeWithDefaults(this);

//        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/oswald_regular.ttf");

    }

    public Activity getCurrentActivity() {
        return mCurrentActivity;
    }

    public void setCurrentActivity(Activity mCurrentActivity) {

        this.mCurrentActivity = mCurrentActivity;
    }



    public Dialog getmCurrentDialog() {
        return mCurrentDialog;
    }

    public void setmCurrentDialog(Dialog mCurrentDialog) {

        this.mCurrentDialog = mCurrentDialog;
    }

    public synchronized static BaseApplication getInstance() {
        if (uniqInstance == null) {
            uniqInstance = new BaseApplication();
        }
        return uniqInstance;
    }
}
