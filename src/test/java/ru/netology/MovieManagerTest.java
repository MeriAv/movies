package ru.netology;
import org.junit.jupiter.api.Test;



public class MovieManagerTest {

    public class MovieManagerTestNonEmpty {
        @Test
        public void shouldRemoveIMovie() {
            MovieManager manager = new MovieManager();
            int idToRemove = 1;
            Movies first = new Movies(1);
            Movies second = new Movies(2);
            Movies third = new Movies(3);
            manager.add(first);
            manager.add(second);
            manager.add(third);

            manager.removeById(idToRemove);

            Movies[] actual = manager.getAll();
            MovieManager[] expected = new MovieManager[]{2,3};

            assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldGet10Movies(){
            MovieManager manager = new MovieManager();
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

            Movies[] expected= manager.get10();
            Movies[] actual = new Movies[]{1,2,3,4,5,6,7,8,9,10};
            assertArrayEquals(expected, actual);
        }
        @Test
        public void shouldAddMovie(){
            MovieManager manager = new MovieManager();
            Movies one = new Movies(1);

            Movies[] expected= manager.add();
            Movies[] actual = MovieManager.lenght(2);
            assertArrayEquals(expected, actual);
        }

    }
}
