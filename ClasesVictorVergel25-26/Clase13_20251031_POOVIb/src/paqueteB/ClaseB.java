package paqueteB;

public class ClaseB extends PadreB {

	private String atributoPrivado = "Atributo Privado ClaseB";

	public String getAtributoPrivado() {
		return atributoPrivado;
	}

	public void setAtributoPrivado(String atributoPrivado) {
		this.atributoPrivado = atributoPrivado;
	}

	@Override
	public String toString() {
		return "ClaseB [atributoPrivado=" + atributoPrivado + ", atributoPrivadoPadre=" + atributoPrivadoPadre + "]";
	}
	
	
	
}
