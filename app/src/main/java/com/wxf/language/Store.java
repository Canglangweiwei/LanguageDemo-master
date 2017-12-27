package com.wxf.language;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

@SuppressWarnings("ALL")
public class Store {

    public static void setLanguageLocal(Context context, String language) {
        SharedPreferences preferences;
        SharedPreferences.Editor editor;
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = preferences.edit();
        editor.putString("language", language);
        editor.apply();
    }

    public static String getLanguageLocal(Context context) {
        SharedPreferences preferences;
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString("language", "");
    }
}
