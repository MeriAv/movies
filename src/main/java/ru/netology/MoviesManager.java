package ru.netology;


public class MoviesManager {
    private Movies[] movie = new Movies[0];

    public static Movies[] length(int i) {
        return new Movies[0];
    }

    public Movies[] getMovie() {
        return movie;
    }

    public void setMovie(Movies[] movie) {
        this.movie = movie;
    }


    private static int length;

    public Movies[] add(Movies item) {
        int length = movie.length + 1;
        Movies[] tmp = new Movies[length];
        System.arraycopy(movie, 0, tmp, 0, movie.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movie = tmp;
        return tmp;
    }

    public Movies[] getAll() {
        Movies[] result = new Movies[movie.length];
        for ( int i = 0; i < result.length; i++ ) {
            int index = movie.length - i - 1;
            result[i] = movie[index];
        }
        return result;
    }

    public Movies[] get10() {
        Movies[] result = new Movies[movie.length];
        for ( int i = 0; i < 9; i++ ) {
            int index = movie.length - i - 1;
            result[i] = movie[index];
        }
        return result;
    }


    public void removeById(int id) {
        int length = movie.length - 1;
        Movies[] tmp = new Movies[length];
        int index = 0;
        for ( Movies item : movie ) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        movie = tmp;
    }
}