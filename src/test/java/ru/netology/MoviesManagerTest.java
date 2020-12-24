package ru.netology;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MoviesManagerTest {


        @Test
        public void shouldRemoveIMovie() {
            MoviesManager manager = new MoviesManager();
            int idToRemove = 1;
            Movies first = new Movies(1);
            Movies second = new Movies(2);
            Movies third = new Movies(3);
            manager.add(first);
            manager.add(second);
            manager.add(third);

            manager.removeById(idToRemove);

            Movies[] actual = manager.getAll();
            int[] expected = new int[]{2, 3};

            assertArrayEquals(new int[][]{expected}, new Movies[][]{actual});
        }

        @Test
        public void shouldGet10Movies() {
            MoviesManager manager = new MoviesManager();
            Movies one = new Movies(1);
            Movies two = new Movies(2);
            Movies three = new Movies(3);
            Movies four = new Movies(4);
            Movies five = new Movies(5);
            Movies six = new Movies(6);
            Movies seven = new Movies(7);
            Movies eight = new Movies(8);
            Movies nine = new Movies(9);
            Movies ten = new Movies(10);
            Movies test = new Movies(11);

            Movies[] expected = manager.get10();
            int[] actual = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            assertArrayEquals(expected, new int[][]{actual});
        }

        @Test
        public void shouldAddMovie() {
            MoviesManager manager = new MoviesManager();
            Movies first = new Movies(1);
            Movies[] expected = manager.add(first);
            Movies[] actual = MoviesManager.length(2);
            assertArrayEquals(expected, actual);
        }

    }
