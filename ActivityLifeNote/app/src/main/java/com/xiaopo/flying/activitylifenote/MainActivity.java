package com.xiaopo.flying.activitylifenote;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  private static final String TAG = "FirstActivity";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d(TAG, "onCreate: ");
    setContentView(R.layout.activity_main);
  }

  @Override protected void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    Log.d(TAG, "onConfigurationChanged: ");
  }

  @Override protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    Log.d(TAG, "onRestoreInstanceState: ");
  }

  @Override protected void onStart() {
    super.onStart();
    Log.d(TAG, "onStart: ");
  }

  @Override protected void onResume() {
    super.onResume();
    Log.d(TAG, "onResume: ");
  }

  @Override protected void onPostResume() {
    super.onPostResume();
    Log.d(TAG, "onPostResume: ");
  }

  @Override protected void onPause() {
    super.onPause();
    Log.d(TAG, "onPause: ");
  }

  @Override protected void onStop() {
    super.onStop();
    Log.d(TAG, "onStop: ");
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    Log.d(TAG, "onDestroy: ");
  }

  @Override protected void onRestart() {
    super.onRestart();
    Log.d(TAG, "onRestart: ");
  }

  @Override protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    Log.d(TAG, "onSaveInstanceState: ");
  }

  public void second(View view) {
    startActivity(new Intent(this,SecondActivity.class));
  }
}
