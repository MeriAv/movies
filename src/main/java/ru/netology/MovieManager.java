package ru.netology;

public class MovieManager {

    private Movie[] films = new Movie[0];

    public void add(Movie film) {
        int length = films.length + 1;
        Movie[] tmp = new Movie[length];
        for ( int i = 0; i < films.length; i++ ) {
            tmp[i] = films[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Movie[] getAll(int maxFilms) {
        Movie[] result = new Movie[films.length];
        int length = films.length;
        if (length > maxFilms) {
            length = maxFilms;
        }
        for ( int i = 0; i < length; i++ ) {
            int index = result.length - i - 1;
            result[i] = films[index];
           }
        result = new Movie[films.length];
        return result;
    }
};


