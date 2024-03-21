package com.widsons.simpleoldapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.widsons.simpleoldapp.databinding.ActivityOtherMainBinding;

public class OtherMainActivity extends AppCompatActivity {
    ActivityOtherMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_other_main);
        binding.setActivity(this);
    }

    public void onButtonTambahClick() {
        int angkaInt1 = Integer.parseInt(binding.editText1.getText().toString());
        int angkaInt2 = Integer.parseInt(binding.editText2.getText().toString());
        binding.textViewHasil.setText("" + (angkaInt1 + angkaInt2));
    }

    public void onButtonKurangClick() {
        int angkaInt1 = Integer.parseInt(binding.editText1.getText().toString());
        int angkaInt2 = Integer.parseInt(binding.editText2.getText().toString());
        binding.textViewHasil.setText("" + (angkaInt1 - angkaInt2));
    }
}