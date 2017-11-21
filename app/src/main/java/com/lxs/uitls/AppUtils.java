package com.lxs.uitls;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Author   :  lxs .
 * E-mail   :  dashu3344@gmail.com
 * Time     :  2017/11/20/13
 * Desc     : 获取当前版本名字
 * Version  :  1.0
 */

public class AppUtils {
    public static String getAppVersionName(Context context) {
        String versionName = null;
        PackageManager pm = context.getPackageManager();

        try {
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            int versionCode = pi.versionCode;
            versionName = pi.versionName;
            if (versionName != null || versionName.length() <= 0) {
                return "";
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            Log.e("Context", e.getMessage());
        }
        return versionName;
    }
}
