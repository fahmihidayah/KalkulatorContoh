package com.widsons.simpleoldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        Button buttonTambah = findViewById(R.id.buttonTambah);
        TextView textViewHasil = findViewById(R.id.textViewHasil);


        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angkaInt1 = Integer.parseInt(editText1.getText().toString());

                int angkaInt2 = Integer.parseInt(editText2.getText().toString());

                textViewHasil.setText("" + (angkaInt1 + angkaInt2));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


}