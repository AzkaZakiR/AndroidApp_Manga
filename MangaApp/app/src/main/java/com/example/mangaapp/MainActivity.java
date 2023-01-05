package com.example.mangaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTitle;
    private ArrayList<Manga> list = new ArrayList<>();
   // private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTitle = findViewById(R.id.rv_images);
        rvTitle.setHasFixedSize(true);

        list.addAll(MangaData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvTitle.setLayoutManager(new LinearLayoutManager(this));
        ListMangaAdapter listMangaAdapter = new ListMangaAdapter(list);
        rvTitle.setAdapter(listMangaAdapter);

       listMangaAdapter.setOnItemClickCallback(new ListMangaAdapter.OnItemClickCallback(){
           @Override
           public void onItemClicked(Manga data){
               showSelectedManga(data);
           }
       });

    }

    private void showRecyclerCardView(){
        rvTitle.setLayoutManager(new LinearLayoutManager(this));
        CardViewMangaAdapter cardViewMangaAdapter = new CardViewMangaAdapter(list);
        rvTitle.setAdapter(cardViewMangaAdapter);

          cardViewMangaAdapter.setOnItemClickCallback(new CardViewMangaAdapter.OnItemClickCallback() {
            @Override
             public void onItemClicked(Manga data) {
                  showSelectedManga(data);
              }
         });

    }

    private void showSelectedManga(Manga manga){
        Intent detail = new Intent(MainActivity.this, DetailPage.class);
        detail.putExtra("", manga.getPhoto());
        detail.putExtra(DetailPage.EXTRA_MANGA, manga.getTitle());
        detail.putExtra(DetailPage.EXTRA_MANGAKA, manga.getMangaka());
        detail.putExtra(DetailPage.EXTRA_GENRE, manga.getGenre());
        detail.putExtra(DetailPage.EXTRA_SYNOPSIS, manga.getSynopsis());
        startActivity(detail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_cardview:
                showRecyclerCardView();
                break;

            case R.id.action_about:
                Intent about = new Intent(MainActivity.this, About.class);
                startActivity(about);
            //    title = "About Me and my life";
            case R.id.action_profile:
                Intent profile = new Intent(MainActivity.this, Profile.class);
                startActivity(profile);
                break;
        }
    }
}
