package ru.netology;

import javax.xml.transform.Result;

public class MovieManager {

    private Movie[] films = new Movie[0];

    public void add(Movie film){
        int length = films.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < films.length; i++){
            tmp [i] = films [i];
        }
        int lastIndex = tmp.length - 1;
        tmp [lastIndex] = film;
        films = tmp;
    };

    public Movie[] getAll(int maxFilms){
        Movie[] result = new Movie[films.length];
        for (int i = 0; i <= maxFilms; i ++ ){
            int index = result.length -i -1;
            result [i] = films[index];
        }
        return result;}
};


