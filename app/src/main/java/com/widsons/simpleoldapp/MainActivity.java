package com.widsons.simpleoldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonJumlah);
        EditText editText = findViewById(R.id.editTextTextNumber1);
        EditText editText2 = findViewById(R.id.editTextTextNumber2);
        TextView textView = findViewById(R.id.textViewHasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(editText.getText().toString());
                int angka2 = Integer.parseInt(editText2.getText().toString());
                int hasil = angka1 + angka2;
                textView.setText(String.valueOf(hasil));
            }
        });
    }

}