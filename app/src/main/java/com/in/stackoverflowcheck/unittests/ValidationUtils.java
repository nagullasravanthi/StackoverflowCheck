package com.in.stackoverflowcheck.unittests;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;

public class ValidationUtils {


    public static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public static void requestFocus(View view, Activity activity) {
        if (view.requestFocus()) {
            activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }
    public static boolean isEmpty(String str) {
        try {
            return (TextUtils.isEmpty(str) || str.equalsIgnoreCase("null"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
