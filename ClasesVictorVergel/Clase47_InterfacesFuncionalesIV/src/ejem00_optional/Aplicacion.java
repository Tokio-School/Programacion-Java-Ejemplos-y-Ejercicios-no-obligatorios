package ejem00_optional;

import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> op = Optional.of("Hola");
		
		boolean existeOP = op.isPresent();
		if (existeOP) {
			System.out.println(op.get().length());
		}
		Optional<String> op2 = Optional.empty();
//		String cadena=null;
		
		Properties propiedades=System.getProperties();
		for (Map.Entry<Object, Object> entrada : propiedades.entrySet()) {
			//System.out.println(entrada.getKey() + "=" + entrada.getValue());
			if (entrada.getKey().equals("java.home")) {
				System.out.println(entrada.getValue());
			}
		}
		
		Optional<String> op3 = Optional.ofNullable(System.getProperty("java.hme"));
		op3.ifPresent(valor->System.out.println(valor));
		
		
		propiedades.entrySet().stream()
				.filter(entrada -> entrada.getKey().equals("java.home"))
				.forEach(entrada -> System.out.println("-->"+entrada.getValue()));
		
		
		Stream<String> razasPerro=Stream.of("Pastor Aleman", "Doberman", "Bulldog", "Pitbull");
		Optional<String> razaP=razasPerro.filter(raza -> raza.startsWith("pp")).findFirst();
		//razaP.ifPresent(dato->System.out.println(dato));
		/*razaP.ifPresentOrElse(dato->System.out.println(dato), new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("No hay raza");
            }
        });*/
		razaP.ifPresentOrElse(dato->System.out.println(dato), ()->System.out.println("No hay raza"));
		
		
		

	}

}
