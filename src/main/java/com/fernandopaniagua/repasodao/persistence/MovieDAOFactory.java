package com.fernandopaniagua.repasodao.persistence;

public class MovieDAOFactory {
    public static IMovieDAO getMovieDAO(){
        return new MovieDAOImplFake();
    }
}
