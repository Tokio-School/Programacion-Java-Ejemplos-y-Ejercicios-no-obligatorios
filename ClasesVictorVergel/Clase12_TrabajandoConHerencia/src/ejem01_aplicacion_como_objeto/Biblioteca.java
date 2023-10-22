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

	public Libro[] getColeccionLibros() {
		return coleccionLibros;
	}

	public void setColeccionLibros(Libro[] coleccionLibros) {
		this.coleccionLibros = coleccionLibros;
	}
    
	public void borrarLibro(String tituloLibro)
	{
		//System.out.println(coleccionLibros[0].getTitulo());
		System.out.println(tituloLibro);
		for (int i = 0; i < coleccionLibros.length; i++) {
			//if (coleccionLibros[i].getTitulo().equalsIgnoreCase(tituloLibro))
			//if (coleccionLibros[i].getTitulo().equals(tituloLibro))
			if (coleccionLibros[i]!=null)
				if (coleccionLibros[i].equals(new Libro( tituloLibro, "",i)))
				{
					coleccionLibros[i]=null;
				}
		}
	}
    
}
