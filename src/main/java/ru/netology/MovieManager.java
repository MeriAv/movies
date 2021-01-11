package ru.netology;

public class MovieManager {

    public Movie[] films = new Movie[0]; // создали массив фильмов, изначальная длина 0

    public void add(Movie film) {
        int length = films.length + 1; // создаем переменную , в которую записываем число, на 1 большее чем длина массива фильмов
        Movie[] tmp = new Movie[length]; //создаем массив тмп, задаем ему длину большую на 1 чем массив фильмов
        for ( int i = 0; i < films.length; i++ ) { //создаем цикл, который будет перебирать все элементы по 1, пока они не закончаться в массиве
            tmp[i] = films[i]; // кладем в массив фильмов последний фильм, тем самым увеличавая массив ещё на 1 фильм
        }
        int lastIndex = tmp.length - 1; // создаем переменную, в которую записываем индекс предпоследнего фильма, так как последний у нас будет пустым
        tmp[lastIndex] = film; // присваиваем массиву фильмов длину вычисленную в предыдущей переменной
        films = tmp;// обновляем для точности
    }

    public Movie[] getAll() {
        int maxFilms = films.length;
        if (maxFilms > 10) {
            maxFilms = 10;
        }
        Movie[] result = new Movie[maxFilms];
        for ( int i = 0; i < result.length; i++ ) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }


}


