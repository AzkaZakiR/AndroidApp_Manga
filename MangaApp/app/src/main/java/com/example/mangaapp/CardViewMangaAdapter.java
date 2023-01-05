package com.example.mangaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMangaAdapter extends RecyclerView.Adapter<CardViewMangaAdapter.CardViewViewHolder> {
    private ArrayList<Manga> listManga;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public CardViewMangaAdapter(ArrayList<Manga> list){
        this.listManga = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_manga, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        final Manga manga = listManga.get(position);

        Glide.with(holder.itemView.getContext())
                .load(manga.getPhoto())
                .apply(new RequestOptions().override(360, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(manga.getTitle());
        holder.tvMangaka.setText(manga.getMangaka());

        holder.btnBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Added to Bookmark " +
                        listManga.get(holder.getAdapterPosition()).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listManga.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listManga.size();
    }



    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvMangaka;
        Button btnBookmark, btnRead;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvMangaka = itemView.findViewById(R.id.tv_item_author);
            btnBookmark = itemView.findViewById(R.id.btn_set_bookmark);
            btnRead = itemView.findViewById(R.id.btn_set_read);
        }
    }
    public interface OnItemClickCallback{
        void onItemClicked(Manga data);
    }
}
