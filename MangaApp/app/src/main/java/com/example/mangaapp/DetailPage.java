package com.example.mangaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPage extends AppCompatActivity {
    public static final String EXTRA_MANGA = "extra_manga";
    public static final String EXTRA_MANGAKA = "extra_mangaka";
    public static final String EXTRA_SYNOPSIS = "extra_synopsis";
    public static final String EXTRA_GENRE = "manga_genre";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        ImageView imgPhoto = findViewById(R.id.img_manga);
        TextView tvManga = findViewById(R.id.text_manga);
        TextView tvMangaka = findViewById(R.id.text_mangaka);
        TextView tvGenre = findViewById(R.id.text_genre);
        TextView tvSynopsis = findViewById(R.id.text_synopsis);

        imgPhoto.setImageResource(getIntent().getIntExtra("", 0));

        String manga = getIntent().getStringExtra(EXTRA_MANGA);
        tvManga.setText(manga);

        String mangaka = getIntent().getStringExtra(EXTRA_MANGAKA);
        tvMangaka.setText(mangaka);

        String genre = getIntent().getStringExtra(EXTRA_GENRE);
        tvGenre.setText(genre);

        String synopsis = getIntent().getStringExtra(EXTRA_SYNOPSIS);
        tvSynopsis.setText(synopsis);

    }
}