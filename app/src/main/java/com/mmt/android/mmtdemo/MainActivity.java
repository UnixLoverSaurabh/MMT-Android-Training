package com.mmt.android.mmtdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        System.out.println("@Saurabh clicked");
        Toast.makeText(getApplication().getBaseContext(), "Welcome", Toast.LENGTH_SHORT).show();
    }
}