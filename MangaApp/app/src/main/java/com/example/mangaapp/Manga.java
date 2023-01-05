package com.example.mangaapp;

public class Manga {
    private String title;
    private String mangaka;
    private String genre;
    private String synopsis;
    private int photo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMangaka() {
        return mangaka;
    }

    public void setMangaka(String mangaka) {
        this.mangaka = mangaka;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
