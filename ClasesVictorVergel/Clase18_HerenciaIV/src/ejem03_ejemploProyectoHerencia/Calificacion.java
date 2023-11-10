package ejem03_ejemploProyectoHerencia;

// TODO: Auto-generated Javadoc
/**
 * The Class Calificacion.
 */
public class Calificacion {
	
	/** The asignatura. */
	private Asignatura asignatura;
	
	/** The nota asig. */
	private int notaAsig;
	
	
	/**
	 * Instantiates a new calificacion.
	 *
	 * @param asignatura the asignatura
	 * @param notaAsig the nota asig
	 */
	public Calificacion(Asignatura asignatura, int notaAsig) {
		super();
		this.asignatura=asignatura;
		this.notaAsig=notaCorrecta(notaAsig)?notaAsig:0;
	}
	
	/**
	 * Gets the asignatura.
	 *
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}
	
	/**
	 * Sets the asignatura.
	 *
	 * @param asignatura the new asignatura
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	/**
	 * Gets the nota asig.
	 *
	 * @return the nota asig
	 */
	public int getNotaAsig() {
		return notaAsig;
	}
	
	/**
	 * Sets the nota asig.
	 *
	 * @param notaAsig the new nota asig
	 */
	public void setNotaAsig(int notaAsig) {
		this.notaAsig=notaCorrecta(notaAsig)?notaAsig:0;
	}

	
	
	@Override
	public String toString() {
		return "Calificacion [asignatura=" + asignatura.getNombre() + ", notaAsig=" + notaAsig + "]";
	}
	public static boolean notaCorrecta(int nota)
	{
		if (nota <= ConstantesNotas.NOTA_MAXIMA &&
				nota >= ConstantesNotas.NOTA_MINIMA)
				return true;
		else
			return false;
	}
	

}
