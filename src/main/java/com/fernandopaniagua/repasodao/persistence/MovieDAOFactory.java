package com.fernandopaniagua.repasodao.persistence;

import com.fernandopaniagua.repasodao.util.PropertiesReader;

public class MovieDAOFactory {
    public static IMovieDAO getMovieDAO(){
        try {
            String tipoPersistencia = PropertiesReader.getProperty("persistence.type");
            System.out.println(tipoPersistencia);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return new MovieDAOImplFake();
        //return new MovieDAOImplSQLite();
        return new MovieDAOImplPostgre();
    }
}
