package ejem01_enum_complejo;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo[] vehiculos=new Vehiculo[3];
		vehiculos[0]=new Vehiculo("VA9933", TipoVehiculo.AUTOMOVIL);
		vehiculos[1]=new Vehiculo("VA9123", TipoVehiculo.MOTO);
		vehiculos[2]=new Vehiculo("VA9123", TipoVehiculo.CAMION);
		
		System.out.println(vehiculos[0]);
		int numTotalRuedas=0;
		for (Vehiculo vehiculo : vehiculos) {
			numTotalRuedas+=vehiculo.getTipo().getNumRuedas();
		}
		System.out.println("En total hay "+numTotalRuedas+" ruedas");
		
		System.out.println("------");
		for (TipoVehiculo vehiculo : TipoVehiculo.values()) {
			System.out.println(vehiculo);
		}  
	}

}
