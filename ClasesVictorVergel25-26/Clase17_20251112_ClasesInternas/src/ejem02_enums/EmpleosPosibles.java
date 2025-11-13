package ejem02_enums;

//public static class EmpleosPosibles {
//	 final static String ANALISTA = "Analista";
//	 final static String PROGRAMADOR = "Programador";
//	 final static String JEFE_PROYECTO = "Jefe de Proyecto";
//	
//}


public enum EmpleosPosibles {
	ANALISTA("Analista"),PROGRAMADOR("Programador"),JEFE_PROYECTO("Jefe de Proyecto");
	private String nombreEmpleo;
	
	EmpleosPosibles(String empleo) {
		this.nombreEmpleo = empleo;
	}

	public String getNombreEmpleo() {
		return nombreEmpleo;
	}

	public void setNombreEmpleo(String nombreEmpleo) {
		this.nombreEmpleo = nombreEmpleo;
	}
	
	
	
}
