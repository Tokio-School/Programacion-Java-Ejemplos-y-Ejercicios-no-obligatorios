package ejem03_colores;

import java.util.Arrays;

public class OrdenacionColores {
    public static void main(String[] args) {
        Color[] colores = {
            new Color("Blue"),
            new Color("Red"),
            new Color("Green"),
            new Color("Red"),
            new Color("Blue"),
            new Color("Green"),
        };

        System.out.println("Array de colores sin ordenar:");
        for (Color color : colores) {
            System.out.println(color);
        }

        Arrays.sort(colores);

        System.out.println("\nArray de colores ordenado por intensidad:");
        for (Color color : colores) {
            System.out.println(color);
        }
    }
	

}
