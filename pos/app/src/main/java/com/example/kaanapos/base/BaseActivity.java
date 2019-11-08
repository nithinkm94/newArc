package com.example.kaanapos.base;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.ContextThemeWrapper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kaanapos.R;
import com.example.kaanapos.utils.SharedPreferenceUtils;

public class BaseActivity extends AppCompatActivity {


    private SharedPreferenceUtils mPreference;
//    private ServiceHelper serviceHelper;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        mPreference = new SharedPreferenceUtils(this);
//        serviceHelper = new ServiceHelper(this);

//        getPushToken();
    }

    public void showActivityCloseDialoge(Context context) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(new ContextThemeWrapper(context,
                R.style.AppTheme_PopupOverlay));

        // set title
        alertDialogBuilder.setTitle(Html.fromHtml("<font color='#ffa000'>Exit App</font>"));

        // set dialog message
        alertDialogBuilder
                .setMessage(getResources().getString(R.string.close_app))
                .setCancelable(false)
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

//                        stopeSocketConnection();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }

}

