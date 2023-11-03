package ejem03_clases_parametrizadas_listas;

import java.util.Arrays;

public class MiLista<T> {
    private T[] elementos;
    private int tamaño;
    private static final int CAPACIDAD_INICIAL = 10;

    public MiLista() {
        elementos = (T[])new Object[CAPACIDAD_INICIAL];
        tamaño = 0;
    }

    public void agregar(T elemento) {
        if (tamaño == elementos.length) {
            // Aumentar la capacidad de la lista si es necesario
            int nuevaCapacidad = elementos.length * 2;
            elementos = Arrays.copyOf(elementos, nuevaCapacidad);
        }
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
   
        T elemento = (T) elementos[indice];
        return elemento;
    }

    public int tamaño() {
        return tamaño;
    }
}

