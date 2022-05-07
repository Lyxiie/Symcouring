package com.apps.ridhamad.symcouring;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

//Tanggal Pengerjaan : 15 April 2022 - 8 Mei 2022
//        Nim : 10119251
//        Nama : Muhamad Ridwan
//        Kelas :IF6

public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Objects.requireNonNull(getSupportActionBar()).hide();

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(this, IntroActivity.class);
            startActivity(intent);
            finish();
        }, 2000);
    }
}