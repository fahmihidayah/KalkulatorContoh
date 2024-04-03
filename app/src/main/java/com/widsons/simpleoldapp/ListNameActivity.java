package com.widsons.simpleoldapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.widsons.simpleoldapp.adapter.ArticleAdapter;
import com.widsons.simpleoldapp.data.Article;
import com.widsons.simpleoldapp.databinding.ActivityListNameBinding;

public class ListNameActivity extends AppCompatActivity {

    ActivityListNameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_name);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        // add 25 random names
        for(int i = 0; i < 25; i++) {
            adapter.add("Jon Doe " + i);
        }
        binding.listViewName.setAdapter(new ArticleAdapter(this, new Article[] {
                new Article("https://go.img/100", "Title 1", "Content 1"),

                new Article("https://go.img/101", "Title 2", "Content 2"),

                new Article("https://go.img/102", "Title 3", "Content 3"),

                new Article("https://go.img/103", "Title 4", "Content 4"),

        }));
    }
}