package ejem00_repasoOO;
import java.util.Arrays;

public class Rectangulo extends Poligono {
	private Punto[] esquinas=new Punto[4];;

	private int lado1,lado2;
	
	public Rectangulo() {
		super();
		lado1=0;lado2=0;
		super.setNumeroPuntos(4);

	}

	/*
	 * Rectangulo con la longitud igual de dos lados a dos lados.
	 */
	public Rectangulo(int lado1, int lado2) {
		this();
		this.lado1 = Math.abs(lado2);
		this.lado2 = Math.abs(lado2);
	}

	@Override
	public String toString() {
		return "Rectangulo [esquinas=" + Arrays.toString(esquinas) + ", lado1=" + lado1 + ", lado2=" + lado2 + ", num_puntos=" + super.getNumeroPuntos() +"]";
	}

	public Punto[] getEsquinas() {
		return esquinas;
	}

	public void setEsquinas(Punto[] esquinas) {
		this.esquinas = esquinas;
	}


	
	
	
}
