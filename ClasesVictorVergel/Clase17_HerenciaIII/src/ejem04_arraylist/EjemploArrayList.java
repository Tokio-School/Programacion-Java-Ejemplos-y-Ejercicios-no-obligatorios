package ejem04_arraylist;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear una ArrayList de cadenas
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Naranja");

        // Obtener un elemento por índice
        String fruta = lista.get(1); // Obtiene "Banana"
        System.out.println("Elemento en índice 1: " + fruta);

        // Reemplazar un elemento
        lista.set(0, "Fresa"); // Reemplaza "Manzana" con "Fresa"
        System.out.println("Lista después de reemplazar: " + lista);

        // Eliminar un elemento por índice
        lista.remove(2); // Elimina "Naranja"
        System.out.println("Lista después de eliminar por índice: " + lista);

        // Verificar si la lista está vacía
        boolean vacía = lista.isEmpty(); // Devuelve false
        System.out.println("¿La lista está vacía? " + vacía);

        // Comprobar si un elemento existe
        boolean contieneBanana = lista.contains("Banana"); // Devuelve true
        System.out.println("¿La lista contiene 'Banana'? " + contieneBanana);

        // Obtener el tamaño de la lista
        int tamaño = lista.size(); // Devuelve 2
        System.out.println("Tamaño de la lista: " + tamaño);

        // Convertir la lista en un array
        Object[] array = lista.toArray();
        System.out.println("Lista convertida en array:");
        for (Object elemento : array) {
            System.out.println(elemento);
        }

        // Limpiar la lista
        lista.clear();
        System.out.println("Lista después de limpiar: " + lista);
    }
}
