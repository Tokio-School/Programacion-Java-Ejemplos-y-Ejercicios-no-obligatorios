package ejem01_notacionFuncionalConstructores;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1 = new Empleado("Juan", 1000);
		
		System.out.println(e1);
		
		Supplier<Empleado> generador=()->new Empleado();
		generador=Empleado::new;
		System.out.println(generador.get());
		
		CreadorEmpleados creador = (nombre)->new Empleado(nombre, 0);
		
		BiFunction<String, Double, Empleado> creador2 = Empleado::new;
		Empleado e2 = creador2.apply("Pedro", 2000.0);
		System.out.println(e2);
		
		
		List<String> datos=Arrays.asList("Juan", "Pedro", "Luis");
		datos.forEach(dato->System.out.println(dato));
		datos.forEach(System.out::println);
		
		
	}

}
@FunctionalInterface
interface CreadorEmpleados{
	Empleado crearConNombre(String nombre);
}
