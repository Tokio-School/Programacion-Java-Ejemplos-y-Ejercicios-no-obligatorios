package ejemplo03.clasesInternas;

public class Libro {
	private String titulo;
	private String autor;
	private int paginas;
	private Capitulo capitulo; 

	public Libro(String titulo, String autor, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	
	
	
	public Capitulo getCapitulo() {
		return capitulo;
	}




	public void setCapitulo(Capitulo capitulo) {
		this.capitulo = capitulo;
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", capitulo=" +capitulo.toString();
	}

	public class Capitulo {
		private String titulo;
		private int numeroPaginas;
		private String resume;
		private String contenido;
		
		
		public Capitulo(String titulo, int numeroPaginas, String resume, String contenido) {
			this.titulo = titulo;
			this.numeroPaginas = numeroPaginas;
			this.resume = resume;
			this.contenido = contenido;
		}


		@Override
		public String toString() {
			return "Capitulo [titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", resume=" + resume
					+ ", contenido=" + contenido + "]";
		}
		
		
	}
	
}
