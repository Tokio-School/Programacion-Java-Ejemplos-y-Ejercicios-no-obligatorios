package com.tokioschool.holamundo;

/*
    Cadenas de texto
 */
public class Cadenas {
    public static void main(String args[]) {
        String cadena = "Estudiamos en Tokio School";
        System.out.println(cadena);

        int longitudCadena = cadena.length();
        System.out.println(longitudCadena);

        int posicion = cadena.indexOf("School");
        System.out.println(posicion);

        String nuevaCadena = cadena.replace("Estudiamos en", "Me gusta");
        System.out.println(nuevaCadena);

        String subCadena = cadena.substring(posicion);
        System.out.println(subCadena);

        String nombreEscuela = cadena.substring(cadena.indexOf("Tokio"));
        System.out.println(nombreEscuela);

        System.out.println(cadena.contains("Japón"));
        System.out.println(cadena.equals("Hola que tal"));
        System.out.println(cadena.equals("Estudiamos en Tokio School"));


    }
}
