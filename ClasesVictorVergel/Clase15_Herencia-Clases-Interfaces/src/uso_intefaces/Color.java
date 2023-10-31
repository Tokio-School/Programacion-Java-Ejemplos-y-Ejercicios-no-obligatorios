package uso_intefaces;

public class Color implements Comparable<Color> {
    private String name;
    
    public Color(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(Color otherColor) {
        // Definir el orden de los colores basado en su "fuerza" o intensidad
        if (this.name.equals("Red")) {
            if (otherColor.name.equals("Red")) {
                return 0; // Los colores "Red" son iguales en intensidad
            } else {
                return 1; // "Red" es más fuerte que cualquier otro color
            }
        } else if (this.name.equals("Green")) {
            if (otherColor.name.equals("Red")) {
                return -1; // "Red" es más fuerte que "Green"
            } else if (otherColor.name.equals("Green")) {
                return 0; // Los colores "Green" son iguales en intensidad
            } else {
                return 1; // "Green" es más fuerte que "Blue"
            }
        } else if (this.name.equals("Blue")) {
            if (otherColor.name.equals("Blue")) {
                return 0; // Los colores "Blue" son iguales en intensidad
            } else {
                return -1; // "Blue" es menos fuerte que cualquier otro color
            }
        }
        return 0; // Por defecto, los colores son considerados iguales (esto debería manejarse mejor)
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Color red = new Color("Red");
        Color green = new Color("Green");
        Color blue = new Color("Blue");

        System.out.println("Comparación entre colores:");
        System.out.println(red + " vs " + green + ": " + red.compareTo(green));
        System.out.println(green + " vs " + blue + ": " + green.compareTo(blue));
        System.out.println(blue + " vs " + red + ": " + blue.compareTo(red));
    }
}
