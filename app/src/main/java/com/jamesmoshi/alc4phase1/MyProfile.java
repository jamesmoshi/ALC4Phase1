package com.jamesmoshi.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        setTitle(R.string.my_profile);
    }
}
