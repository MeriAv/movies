package ru.netology;


public class Movie {
    private int id;
    private String name;
    private String genre;
    private String img;
    private int data;
    private int maxFilms;

    public int getMinFilms() {
        return minFilms;
    }

    public void setMinFilms(int minFilms) {
        this.minFilms = minFilms;
    }

    private int minFilms;

    public Movie(int id) {
        this.id = id;
    }

    public Movie() {
    }

    public Movie(int id, String name, String genre, String img, int data, int maxFilms) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.img = img;
        this.data = data;
        this.maxFilms = maxFilms;
    }

    public int getMaxFilms() {
        return maxFilms;
    }

    public void setMaxFilms(int maxfilms) {
        this.maxFilms = maxfilms;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
