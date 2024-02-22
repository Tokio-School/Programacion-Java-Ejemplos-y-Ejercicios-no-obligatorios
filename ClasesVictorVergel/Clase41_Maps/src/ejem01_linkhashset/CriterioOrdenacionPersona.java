package ejem01_linkhashset;

import java.util.Comparator;

public class CriterioOrdenacionPersona implements Comparator<Persona>{

	enum Criterio {
		NOMBRE,APELLIDO,EDAD;
	}
	private Criterio criterio;
	
	
	
	public CriterioOrdenacionPersona(Criterio criterio) {
		super();
		this.criterio = criterio;
	}



	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		switch (criterio) {
			case NOMBRE:
				return o1.getNombre().compareTo(o2.getNombre());
			case APELLIDO:
				return o1.getApellido().compareTo(o2.getApellido());
			case EDAD:
				return o1.getEdad() - o2.getEdad() ;
		}
		return 0;
	
	}
}
