package ejem05_productor_consumidor;

public class MiPalabra {
	private String palabra;

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public String toString() {
		return "MiPalabra [palabra=" + palabra + "]";
	}
	
	
	
}
