package ejem02_losbasicos;

public class EjemploStringBuilder {
    public static void main(String[] args) {
    	//Igual que StringBuffer pero permite trabajar con procesos.
        StringBuilder sb = new StringBuilder();

        sb.append("Hola, "); // Agregar texto al final
        sb.append("mundo!");
        System.out.println(sb.toString()); // "Hola, mundo!"

        sb.insert(5, "querido "); // Insertar texto en una posición específica
        System.out.println(sb.toString()); // "Hola, querido mundo!"

        sb.replace(5, 12, "amigo"); // Reemplazar un rango de caracteres
        System.out.println(sb.toString()); // "Hola, amigo mundo!"

        sb.delete(5, 11); // Eliminar un rango de caracteres
        System.out.println(sb.toString()); // "Hola, mundo!"

        sb.reverse(); // Invertir la cadena
        System.out.println(sb.toString()); // "!odnum ,aloH"

        int capacidad = sb.capacity(); // Obtener la capacidad actual
        System.out.println("Capacidad: " + capacidad); // Muestra la capacidad actual

        sb.setLength(5); // Establecer la longitud de la cadena
        System.out.println(sb.toString()); // "!odnu"

        sb.setLength(0); // Borrar todo el contenido
        System.out.println(sb.toString()); // ""
    }
}
