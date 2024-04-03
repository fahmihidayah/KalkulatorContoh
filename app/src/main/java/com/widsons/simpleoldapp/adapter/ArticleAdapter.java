package com.widsons.simpleoldapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.widsons.simpleoldapp.R;
import com.widsons.simpleoldapp.data.Article;
import com.widsons.simpleoldapp.databinding.ItemArticleBinding;

public class ArticleAdapter extends ArrayAdapter<Article> {
    public ArticleAdapter(Context context, Article[] articles) {
        super(context, 0, articles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Article article = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(com.widsons.simpleoldapp.R.layout.item_article, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.textViewTitle);
        TextView tvHome = (TextView) convertView.findViewById(R.id.textViewContent);
        // Populate the data into the template view using the data object
        tvName.setText(article.getTitle());
        tvHome.setText(article.getContent());
        // Return the completed view to render on screen
        return convertView;

    }
}
