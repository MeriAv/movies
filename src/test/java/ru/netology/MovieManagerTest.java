package ru.netology;
import org.junit.jupiter.api.Test;
import ru.netology.Movie;
import ru.netology.MovieManager;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class MovieManagerTest {
    MovieManager manager = new MovieManager();
    @Test
    public void shouldAGetFilmsNorm() {
        Movie first = new Movie(1);
        Movie second = new Movie(2);
        Movie third = new Movie(3);
        Movie fourth = new Movie(4);
        Movie fifth = new Movie(5);
        Movie sixth = new Movie(6);
        Movie seventh = new Movie(7);
        Movie eighth = new Movie(8);
        Movie ninth = new Movie(9);
        Movie tenth = new Movie(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldAGetFilmsUnder() {
        Movie first = new Movie(1);
        Movie second = new Movie(2);
        Movie third = new Movie(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldAGetFilmsOver() {
        Movie first = new Movie(1);
        Movie second = new Movie(2);
        Movie third = new Movie(3);
        Movie fourth = new Movie(4);
        Movie fifth = new Movie(5);
        Movie sixth = new Movie(6);
        Movie seventh = new Movie(7);
        Movie eighth = new Movie(8);
        Movie ninth = new Movie(9);
        Movie tenth = new Movie(10);
        Movie eleventh = new Movie(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }
}