package ejem0_clasesinternas;

public class Direccion {
	
	private String tipoVia; //Calle, Avenida, Plaza, Paseo, etc.
	private String nombreVia; 
	private int numero;
	private int piso;
	private String ciudad;
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @param tipoVia
	 * @param nombreVia
	 * @param numero
	 * @param piso
	 * @param ciudad
	 */
	public Direccion(String tipoVia, String nombreVia, int numero, int piso, String ciudad) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.numero = numero;
		this.piso = piso;
		this.ciudad = ciudad;
	}
	/**
	 * 
	 */
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", numero=" + numero + ", piso=" + piso
				+ ", ciudad=" + ciudad + "]";
	}
	
	
	

}
