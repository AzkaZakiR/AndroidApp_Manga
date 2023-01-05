package com.example.mangaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMangaAdapter extends RecyclerView.Adapter<ListMangaAdapter.ListViewHolder> {
    private ArrayList<Manga> listManga;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListMangaAdapter(ArrayList<Manga> list){
        this.listManga = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_images, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Manga manga = listManga.get(position);
        Glide.with(holder.itemView.getContext())
                .load(manga.getPhoto())
                .apply(new RequestOptions(). override(60, 60))
                .into(holder.imgPhoto);
        holder.tvName.setText(manga.getTitle());
        holder.tvMangaka.setText(manga.getMangaka());

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

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvMangaka;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvMangaka = itemView.findViewById(R.id.tv_item_author);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Manga data);
    }
}
