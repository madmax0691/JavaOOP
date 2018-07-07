package com.mkaz.homeworks.lesson9.movieyearfinder;

public class Movie {
    private final String name;
    private final int releaseYear;
    private final Genre genre;

    public Movie(String name, int releaseYear, Genre genre) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (releaseYear != movie.releaseYear) return false;
        if (name != null ? !name.equals(movie.name) : movie.name != null) return false;
        return genre == movie.genre;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + releaseYear;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}