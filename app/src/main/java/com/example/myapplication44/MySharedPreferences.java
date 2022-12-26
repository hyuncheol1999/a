package com.example.myapplication44;

import android.content.Context;
        import android.content.SharedPreferences;
        import android.preference.PreferenceManager;

public class MySharedPreferences {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    public MySharedPreferences(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
    }

    public void setString(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public String getString(String key) {
        return pref.getString(key, "");
    }

    public void setInt(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public int getInt(String key) {
        return pref.getInt(key, 0);
    }

    public void setLong(String key, Long value) {
        editor.putLong(key, value);
        editor.commit();
    }

    public Long getLong(String key) {
        return pref.getLong(key, 0);
    }

    public void setBoolean(String key, Boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public Boolean getBoolean(String key) {
        return pref.getBoolean(key, false);
    }
}