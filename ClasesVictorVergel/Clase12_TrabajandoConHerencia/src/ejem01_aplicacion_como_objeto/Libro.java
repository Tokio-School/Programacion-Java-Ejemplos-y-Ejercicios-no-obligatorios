package ejem01_aplicacion_como_objeto;

public class Libro {
    
	private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    
    
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.titulo.equals(((Libro)obj).titulo);
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getNumPaginas() {
		return numPaginas;
	}



	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}



	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}
    
    

}
