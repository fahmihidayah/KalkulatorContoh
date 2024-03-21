package com.widsons.simpleoldapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.widsons.simpleoldapp.databinding.ActivityEntryPointBinding;

public class EntryPointActivity extends AppCompatActivity {

    ActivityEntryPointBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_entry_point);
        binding.setActivity(this);
    }

    public void onClickToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickToOtherMainActivity() {
        Intent intent = new Intent(this, OtherMainActivity.class);
        startActivity(intent);
    }
}