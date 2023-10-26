package com.shweta.practicebook;

import android.content.Context;
import android.content.SharedPreferences;

public class MyPreference {

   Context context;
   private SharedPreferences.Editor editor;
   public final String MY_PREFS_NAME = "myPreference";
   private  SharedPreferences pref;



   public MyPreference(Context context){
       this.context = context;
       this.editor = context.getSharedPreferences(MY_PREFS_NAME, context.MODE_PRIVATE).edit();
       this.pref = context.getSharedPreferences(MY_PREFS_NAME,context.MODE_PRIVATE);
   }


   public String putPreferenceValue(String key, String value){
       editor.putString(key, value);
       editor.commit();
       return key;
   }

   public String getPreferencesValues(String key){
       return pref.getString(key,"");
   }



   public boolean putPreferenceBoolValuesDefault(String key, boolean value) {
       editor.putBoolean(key, value);
       editor.commit();
       return value;
   }

   public boolean getPreferenceBoolValuesDefault(String key) {
       return pref.getBoolean(key, false);
   }

   public void putPreferenceIntValues(String key, int value) {
       editor.putInt(key, value);
       editor.commit();
   }

   public int getPreferenceIntValues(String key) {
       return pref.getInt(key, 0);
   }



}
