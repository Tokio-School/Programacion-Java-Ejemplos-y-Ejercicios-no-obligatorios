package ejemplo03.clasesInternas;

import ejemplo03.clasesInternas.Libro.Capitulo;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro = new Libro("Java 8", "Juan", 300);
		//System.out.println(libro);
		
		Capitulo capitulo = libro.new Capitulo("Capitulo 1", 10, "Resumen", "Contenido");
		libro.setCapitulo(capitulo);
		System.out.println(libro);
		
		System.out.println(capitulo);
		
	}

}
