import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
public class Coche extends Vehiculo implements Arrancable, Acelerable {
	private static int numeroCoches;
	
	public Coche() {
		Coche.numeroCoches++;
		System.out.println("Numero de coches: "+numeroCoches);
	}
	
	private String marca;
	private String modelo;
	private String numeroBastidor;
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", getNumeroRuedas()=" + getNumeroRuedas() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*boolean marcaIgual=this.marca.equals(((Coche)obj).marca);
		boolean modeloIgual=this.modelo.equals(((Coche)obj).modelo);
		boolean ruedasIgual=this.getNumeroRuedas()==((Coche)obj).getNumeroRuedas();
		return marcaIgual && modeloIgual && ruedasIgual;*/
		
		return this.numeroBastidor.equals(((Coche)obj).numeroBastidor);
	}
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("El coche esta acelerando");
	}
	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println("El coche esta arrancando");
	}
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("El coche esta parado");
	}

	
}
