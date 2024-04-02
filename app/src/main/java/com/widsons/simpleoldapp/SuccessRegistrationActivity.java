package com.widsons.simpleoldapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.widsons.simpleoldapp.databinding.ActivitySuccessRegistrationBinding;

public class SuccessRegistrationActivity extends AppCompatActivity {

    ActivitySuccessRegistrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_success_registration);
        String name = getIntent().getStringExtra("name");
        binding.textViewUserName.setText("Welcome " + name + "!");
    }
}