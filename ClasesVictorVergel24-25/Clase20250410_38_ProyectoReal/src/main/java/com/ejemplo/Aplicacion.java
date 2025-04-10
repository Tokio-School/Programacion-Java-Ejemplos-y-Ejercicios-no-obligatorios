package com.ejemplo;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class Aplicacion {
    public static void main(String[] args) {
        Properties props = new Properties();
        String lang = System.getProperty("user.language");

        try (InputStream is = Aplicacion.class.getClassLoader().getResourceAsStream(lang + ".properties")) {
            if (is != null) {
                props.load(is);
                System.out.println("Traducción cargada: " + props.getProperty("saludo"));
            } else {
                System.err.println("Archivo de idioma no encontrado: " + lang + ".properties");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Properties propEjecucion = new Properties();
		try {
			propEjecucion.load(Aplicacion.class.getClassLoader().getResourceAsStream("configuracion.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------------------------------");
		propEjecucion.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println(System.getProperty("desarrollo"));
    }
}
