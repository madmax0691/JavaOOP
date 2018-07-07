package com.mkaz.homeworks.lesson9.movieyearfinder;

//Задан интерфейс поисковика фильмов по году выпуска:
//public interface MovieYearFinder {
//   void add(Movie movie);
//   List<Movie> findByReleaseYear(int releaseYear);
//   List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear);
//}
//
//Объект типа MovieYearFinder хранит объекты Movie (название, год выпуска, жанр)
// и предоставляет функционал быстрого поиска фильмов по заданному году выпуска и диапазону годов выпуска.
//Написать класс MapMovieYearFinder, который реализует интерфейс MovieYearFinder с использованием TreeMap.
// Все операции из интерфейса должны выполняться за логарифмическое время O(log2N) (или близкое к логарифмическому).
//Подсказка: использовать методы из интерфейса SortedMap, который реализуется классом TreeMap

import java.util.List;

public class MapMovieYearFinderRunner {
    public static void main(String[] args) {
        MovieYearFinder finder = new MapMovieYearFinder();

        finder.add(new Movie("The Green Mile", 1999, Genre.DRAMA));
        finder.add(new Movie("Pulp Fiction", 1994, Genre.CRIME));
        finder.add(new Movie("The Kid", 1921, Genre.COMEDY));
        finder.add(new Movie("Forrest Gump", 1994, Genre.DRAMA));

        System.out.println("Movies with release year 1994:");
        List<Movie> movies1994 = finder.findByReleaseYear(1994);
        printMovies(movies1994);
        System.out.println();

        System.out.println("Movies with release year 2000:");
        List<Movie> movies2000 = finder.findByReleaseYear(2000);
        printMovies(movies2000);
        System.out.println();

        System.out.println("Movies with release years 1990...2000:");
        List<Movie> movies1990To2000 = finder.findByReleaseYears(1990, 2000);
        printMovies(movies1990To2000);
    }

    private static void printMovies(List<Movie> movies) {
        if (movies.isEmpty()) {
            System.out.println("<list is empty>");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }
}
//Test
//Movies with release year 1994:
//Movie{name='Pulp Fiction', releaseYear=1994, genre='CRIME'}
//Movie{name='Forrest Gump', releaseYear=1994, genre='DRAMA'}
//
//Movies with release year 2000:
//<list is empty>
//
//Movies with release years 1990...2000:
//Movie{name='Pulp Fiction', releaseYear=1994, genre='CRIME'}
//Movie{name='Forrest Gump', releaseYear=1994, genre='DRAMA'}
//Movie{name='The Green Mile', releaseYear=1999, genre='DRAMA'}
//
//Process finished with exit code 0