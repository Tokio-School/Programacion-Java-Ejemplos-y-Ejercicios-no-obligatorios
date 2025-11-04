package paqueteB;

public class PadreB {
	protected String atributoPrivadoPadre = "Atributo Privado PadreB";

	public String getAtributoPrivado() {
		return atributoPrivadoPadre;
	}

	public void setAtributoPrivado(String atributoPrivado) {
		this.atributoPrivadoPadre = atributoPrivado;
	}
	
	public String toString() {
		String cadena="Tipo de clase que apunta ";
		if (this instanceof ClaseB) {
			return cadena+" ClaseB";
		} else return cadena+" OtraClaseB";
		
	}
	
	
}
