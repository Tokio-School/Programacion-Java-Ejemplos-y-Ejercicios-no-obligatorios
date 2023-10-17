package ejem01_aplicacion_como_objeto;

import java.util.Date;

public class Aplicacion {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
        Biblioteca biblioteca = new Biblioteca();

        // Crear 20 libros y agregarlos a la colección
        for (int i = 0; i < 20; i++) {
            Libro libro = new Libro("Libro " + (i + 1), "Autor " + (i + 1), 200 + i * 10);
            biblioteca.agregarLibro(libro);
        }

        // Crear 10 usuarios
        Usuario[] usuarios = new Usuario[10];
        for (int i = 0; i < 10; i++) {
            usuarios[i] = new Usuario("Usuario " + (i + 1));
        }

        // Crear 5 ejemplos de préstamo
        Prestamo[] prestamos = new Prestamo[5];
        prestamos[0] = new Prestamo(, usuarios[0], new Date());
        prestamos[1] = new Prestamo(, usuarios[1], new Date());
        prestamos[2] = new Prestamo(, usuarios[2], new Date());
        prestamos[3] = new Prestamo(, usuarios[3], new Date());
        prestamos[4] = new Prestamo(, usuarios[4], new Date());

        
    }

}
