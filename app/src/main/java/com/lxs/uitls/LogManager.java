package com.lxs.uitls;

import android.util.Log;

/**
 * Author   :  lxs .
 * E-mail   :  dashu3344@gmail.com
 * Time     :  2017/11/20/14
 * Desc     :
 * Version  :  1.0
 */

public class LogManager {

    private final static boolean IS_DEBUG_ON = true;

    public static void v(String tag, String msg) {

        if (IS_DEBUG_ON) {
            Log.v(tag, msg);
        }
    }

    public static void i(String tag, String text) {
        if (IS_DEBUG_ON) {
            Log.i(tag, text);
        }
    }


    public static void d(String tag, String text) {
        if (IS_DEBUG_ON) {
            Log.d(tag, text);
        }
    }


    public static void w(String tag, String text) {
        Log.w(tag, text);
    }

    public static void e(String tag, String text) {
        Log.e(tag, text);
    }

    public static void e(String tag, Exception tr) {
        Log.e(tag, tr.getMessage());
    }
}
