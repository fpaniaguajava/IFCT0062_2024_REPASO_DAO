package com.fernandopaniagua.repasodao;

import com.fernandopaniagua.repasodao.model.Movie;
import com.fernandopaniagua.repasodao.persistence.IMovieDAO;
import com.fernandopaniagua.repasodao.persistence.MovieDAOFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IMovieDAO movieDAO = MovieDAOFactory.getMovieDAO();
        Movie elconclave = new Movie(1, "El cónclave", "Desconocido");
        movieDAO.create(elconclave);

        Movie peliculaLeida = movieDAO.read(1);
        System.out.println(peliculaLeida);
    }
}