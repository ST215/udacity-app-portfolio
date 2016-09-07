package com.stanleygriggs.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class portfolio extends Activity {

    private Button button;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

    }

    public void onBtnClicked(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(getApplicationContext(), "Popular Movies was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(),"Stock Hawk was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "Build it Bigger was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(),"Make Your App Material was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(), "Go Ubiquitous was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(),"Capstone was clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
