package ejem01_aplicacion_como_objeto;

import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private Date fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, Date fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaDevolucion = fechaDevolucion;
    }

    
}