package com.fernandopaniagua.repasodao.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    public static String getProperty(String property) throws IOException {
        Properties props = new Properties();
        try (InputStream input = PropertiesReader.class.getClassLoader().getResourceAsStream("application.properties")) {
            props.load(input);
        }
        String value = props.getProperty(property);
        return value;
    }
}
