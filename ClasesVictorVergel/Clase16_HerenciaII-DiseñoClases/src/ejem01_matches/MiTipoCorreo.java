package ejem01_matches;

public class MiTipoCorreo implements CharSequence {
    private String correoElectronico;

    public MiTipoCorreo(String correo) {
        if (esCorreoValido(correo)) {
            this.correoElectronico = correo;
        } else {
            throw new IllegalArgumentException("El correo no cumple con el formato esperado.");
        }
    }

    private boolean esCorreoValido(String correo) {
        // Verificar si el correo contiene una arroba en el medio y un punto al final
        return correo.matches(".+@.+.com");
    }

    @Override
    public int length() {
        return correoElectronico.length();
    }

    @Override
    public char charAt(int index) {
        return correoElectronico.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new MiTipoCorreo(correoElectronico.substring(start, end));
    }

    @Override
    public String toString() {
        return correoElectronico;
    }

    public static void main(String[] args) {
        try {
            MiTipoCorreo miCorreo = new MiTipoCorreo("ejemplo@correo.com");
            System.out.println("Correo válido: " + miCorreo);
            System.out.println("Longitud del correo: " + miCorreo.length());

            // Ejemplo de subsecuencia
            CharSequence subsequence = miCorreo.subSequence(7, 13);
            System.out.println("Subsecuencia: " + subsequence);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

