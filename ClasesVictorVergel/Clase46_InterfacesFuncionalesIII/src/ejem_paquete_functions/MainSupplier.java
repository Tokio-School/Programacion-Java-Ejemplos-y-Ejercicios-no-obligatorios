package ejem_paquete_functions;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MainSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> aleatorio = new Supplier<Double>() {
			@Override
			public Double get() {
				return Math.random();
			}
		};
		
		aleatorio = () -> Math.random();
		//System.out.println(aleatorio.get());
	
		
		DoubleSupplier aleatorio2 = () -> Math.random();
		//System.out.println(aleatorio2.getAsDouble());
		
		
		Stream conjuntoDatos=Stream.generate(() -> (int)Math.round(Math.random()*10)).limit(5);
		conjuntoDatos.filter(dato -> ((int)dato<5)).forEach(dato-> System.out.println(dato));
		
		
	}

}
