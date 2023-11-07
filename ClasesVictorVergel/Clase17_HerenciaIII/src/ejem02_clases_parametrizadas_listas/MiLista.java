package ejem02_clases_parametrizadas_listas;

import java.util.Arrays;

public class MiLista<K,T> {
	
    private K[] elementos;
    private T propietario;
    private int tamaño; //ocupacion actual del Array
    private static final int CAPACIDAD_INICIAL = 10;

    public MiLista() {
        elementos = (K[]) new Object[CAPACIDAD_INICIAL];
        tamaño = 0;
    }
    public MiLista(T propietario) {
    	this();
        this.propietario=propietario;
    }

    public void agregar(K elemento) {
        if (tamaño == elementos.length) {
            // Aumentar la capacidad de la lista si es necesario
            int nuevaCapacidad = elementos.length * 2;
            elementos = Arrays.copyOf(elementos, nuevaCapacidad);
        }
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public K obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
   
        K elemento = (K) elementos[indice];
        return elemento;
    }

    public int tamaño() {
        return tamaño;
    }
}

