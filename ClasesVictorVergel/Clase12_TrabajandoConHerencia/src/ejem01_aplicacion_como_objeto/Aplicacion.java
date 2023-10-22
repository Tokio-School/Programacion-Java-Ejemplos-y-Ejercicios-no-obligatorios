package ejem01_aplicacion_como_objeto;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Aplicacion {

	/*public Aplicacion()
	{
		
	}*/
	Biblioteca biblioteca;
	Scanner teclado;
	
	public static void main(String[] args) {
		// Llamando a inicializacion sin objetos.
		//Aplicacion.inicializarBiblioteca();
		
		Usuario pedro=new Usuario("Pedro");
		Usuario otroPedro=new Usuario("Pedro");
		pedro.setNombre("Pedro Olivar");
		Usuario temp=new Usuario("Juanito");
		temp=pedro;
		temp.setNombre("Pedro2");
		
		if (temp==pedro)
			System.out.println("Son iguales. Nombre pedro:"+pedro.getNombre()+" Nombre temp:"+temp.getNombre());
		else
			System.out.println("No son iguales");
		
		
		
		
		
		// Llmaando a inicialización con objetos.
		Aplicacion app=new Aplicacion();
		app.inicializarBiblioteca();
        
	
		app.teclado=new Scanner(System.in);

		int opcionSeleccionada;
		do {
			opcionSeleccionada=app.mostrarMenu();
			switch (opcionSeleccionada) {
			case 1: 
				{
					app.borrarLibro();
					break;
				}
			default:
				System.out.println("Opciones no implmentadas");
			}
		} while(opcionSeleccionada!=2);
        
    }
	private int mostrarMenu() {
		// TODO Auto-generated method stub
		System.out.println("Seleccione la opción");
		System.out.println("1.- Borrar libro");
		System.out.println("2.- Salir");
		
		int opcion=teclado.nextInt();
		teclado.nextLine();

		return opcion;
		
	}
	private void borrarLibro()
	{
		System.out.println("Antes de borrar libros:"+Arrays.toString(biblioteca.getColeccionLibros()));
		System.out.println("Seleccione el libro según su título:");
		String titulo=teclado.nextLine();
		//String titulo="Libro 1";
		// TODO borrar el libro
		System.out.println("Se borrará el libro: "+titulo);
		biblioteca.borrarLibro(titulo);
		System.out.println("Despues de borrar libros:"+Arrays.toString(biblioteca.getColeccionLibros()));
	}
	
	
	
	
	// Llamando de forma Statica
	//private static void inicializarBiblioteca() {
	
	// Llamando a través de objetos.
	private void inicializarBiblioteca() {
		// TODO Auto-generated method stub
		biblioteca = new Biblioteca();

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
       /* Prestamo[] prestamos = new Prestamo[5];
        prestamos[0] = new Prestamo(, usuarios[0], new Date());
        prestamos[1] = new Prestamo(, usuarios[1], new Date());
        prestamos[2] = new Prestamo(, usuarios[2], new Date());
        prestamos[3] = new Prestamo(, usuarios[3], new Date());
        prestamos[4] = new Prestamo(, usuarios[4], new Date());*/

	}

}
