package ejem01_aplicacion_como_objeto;

public class Biblioteca {


    private Libro[] coleccionLibros = new Libro[20];
    private int posicion=0;
    
    public void agregarLibro(Libro libro) {
        coleccionLibros[posicion]=libro;
        posicion++;
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        // Lógica para realizar un préstamo
    }
}
