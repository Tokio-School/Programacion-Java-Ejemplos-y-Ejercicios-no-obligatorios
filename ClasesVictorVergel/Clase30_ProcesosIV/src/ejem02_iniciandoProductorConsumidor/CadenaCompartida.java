package ejem02_iniciandoProductorConsumidor;

public class CadenaCompartida {
	private String cadenaTexto;

	public String getCadenaTexto() {
		return cadenaTexto;
	}

	public void setCadenaTexto(String cadenaTexto) {
		this.cadenaTexto = cadenaTexto;
	}


	@Override
	public String toString() {
		return "CadenaCompartida [cadenaTexto=" + cadenaTexto + "]";
	}
	

}
