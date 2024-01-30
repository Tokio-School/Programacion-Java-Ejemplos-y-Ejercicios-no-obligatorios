package ejem01_enum_complejo;

public class Vehiculo {
	
	private String matricula;
	private TipoVehiculo tipo;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public TipoVehiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}
	public Vehiculo(String matricula, TipoVehiculo tipo) {
		super();
		this.matricula = matricula;
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tipo=" + tipo.getNombre() +" con "+ + tipo.getNumRuedas() + " ruedas ]";
	}
	
	
	
	
	

}
