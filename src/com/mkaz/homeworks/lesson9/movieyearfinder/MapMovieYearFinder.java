package com.mkaz.homeworks.lesson9.movieyearfinder;

import java.util.*;

public class MapMovieYearFinder implements MovieYearFinder {
    private final SortedMap<Integer, List<Movie>> movieMap = new TreeMap<>();

    @Override
    public void add(Movie movie) {
        if (movieMap.get(movie.getReleaseYear()) != null) {
            List<Movie> movies = movieMap.get(movie.getReleaseYear());
            movies.add(movie);
            movieMap.put(movie.getReleaseYear(), movies);
        } else {
            List<Movie> movies = new ArrayList<>();
            movies.add(movie);
            movieMap.put(movie.getReleaseYear(), movies);
        }
    }

    @Override
    public List<Movie> findByReleaseYear(int releaseYear) {
        if (movieMap.get(releaseYear) != null) {
            return movieMap.get(releaseYear);
        }
        return new ArrayList<Movie>();
    }

    @Override
    public List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear) {
        List<Movie> movies = new ArrayList<>();
        SortedMap<Integer, List<Movie>> temp = movieMap.subMap(minReleaseYear, maxReleaseYear);
        for (Collection<Movie> collection : temp.values()) {
            movies.addAll(collection);
        }
        return movies;
    }
}
