package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldShow10LastMovies() {

        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, 1, "bloodshot", "action movie", true);
        Movie second = new Movie(2, 2, "vpered", "cartoon", false);
        Movie third = new Movie(3, 3, "hotel Belgrad", "comedy", true);
        Movie forth = new Movie(4, 4, "gentlemen", "action movie", false);
        Movie fifth = new Movie(5, 5, "invisible", "horror", false);
        Movie sixth = new Movie(6, 6, "trolls", "cartoon", true);
        Movie seventh = new Movie(7, 7, "number one", "comedy", true);
        Movie eighth = new Movie(8, 8, "venom 2", "action movie", true);
        Movie ninth = new Movie(9, 9, "no time to die", "action movie", true);
        Movie tenth = new Movie(10, 10, "dune", "science fiction", false);
        Movie eleventh = new Movie(11, 11, "the addams values", "cartoon", true);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShow10LastMoviesIfListLess10() {

        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, 1, "bloodshot", "action movie", true);
        Movie second = new Movie(2, 2, "vpered", "cartoon", false);
        Movie third = new Movie(3, 3, "hotel Belgrad", "comedy", true);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseNoArgsConstructor() {
    }

    @Test
    public void shouldUseAllArgsConstructor() {

        Movie movie = new Movie();

        movie.setMovieId(2);
        movie.setId(2);
        movie.setMovieName("vpered");
        movie.setMovieGenre("cartoon");
        movie.setPremierTomorrow(false);

        assertEquals(2, movie.getMovieId());
        assertEquals(2, movie.getId());
        assertEquals("vpered", movie.getMovieName());
        assertEquals("cartoon", movie.getMovieGenre());
        assertEquals(false, movie.isPremierTomorrow());
    }

    @Test
    public void shouldCountManager() {

        MovieManager manager = new MovieManager();

        manager.setCountMovies(10);

        assertEquals(10, manager.getCountMovies());
    }

    @ParameterizedTest
    @CsvSource(
             {"1",
              "2",
              "3"
            })
    public void shouldSetCountManager(int countMovies) {
        MovieManager manager = new MovieManager(countMovies);
        assertEquals(countMovies, manager.getCountMovies());
    }
}
