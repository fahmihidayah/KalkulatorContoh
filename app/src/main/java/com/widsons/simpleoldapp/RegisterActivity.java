package com.widsons.simpleoldapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.widsons.simpleoldapp.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        binding.setActivity(this);
    }

    public void register() {
        String name = binding.editTextName.getText().toString();
        Intent intent = new Intent(this, SuccessRegistrationActivity.class);
        startActivity(intent.putExtra("name", name));
        finish();
    }

}