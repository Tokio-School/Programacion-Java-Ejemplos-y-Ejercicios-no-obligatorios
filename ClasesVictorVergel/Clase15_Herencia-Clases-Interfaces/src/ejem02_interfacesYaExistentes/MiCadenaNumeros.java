package ejem02_interfacesYaExistentes;

public class MiCadenaNumeros implements CharSequence {
    private String cadenaNumeros;

    public MiCadenaNumeros(String cadena) {
        // Verificar si la cadena contiene solo números y, en caso contrario, lanzar una excepción
        if (esCadenaNumerica(cadena)) {
            this.cadenaNumeros = cadena;
        } else {
            throw new IllegalArgumentException("La cadena no contiene solo números.");
        }
    }

    private boolean esCadenaNumerica(String cadena) {
        return cadena.matches("[0-9]+");
    }

    @Override
    public int length() {
        return cadenaNumeros.length();
    }

    @Override
    public char charAt(int index) {
        return cadenaNumeros.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new MiCadenaNumeros(cadenaNumeros.substring(start, end));
    }

    @Override
    public String toString() {
        return cadenaNumeros;
    }

    public static void main(String[] args) {
        try {
            MiCadenaNumeros miCadena = new MiCadenaNumeros("12345");
            System.out.println("Cadena válida: " + miCadena);
            System.out.println("Longitud de la cadena: " + miCadena.length());

            // Ejemplo de subsecuencia
            CharSequence subsequence = miCadena.subSequence(1, 4);
            System.out.println("Subsecuencia: " + subsequence);
            System.out.println(miCadena.esCadenaNumerica("12345"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

