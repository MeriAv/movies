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

    public Movie[] getAll() {
        Movie[] result = new Movie[films.length];
        int maxFilms = result.length;
        if (maxFilms > 10) {
            maxFilms = 10;
        }
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for ( int i = 0; i < maxFilms; i++ ) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}


