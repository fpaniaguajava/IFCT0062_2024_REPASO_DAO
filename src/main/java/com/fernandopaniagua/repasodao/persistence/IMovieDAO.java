package com.fernandopaniagua.repasodao.persistence;

import java.util.List;
import com.fernandopaniagua.repasodao.model.Movie;

public interface IMovieDAO {
    public void create(Movie movie);
    public Movie read(int id);
    public List<Movie> readAll();
    public void update(Movie movie);
    public void delete(int id);
}
