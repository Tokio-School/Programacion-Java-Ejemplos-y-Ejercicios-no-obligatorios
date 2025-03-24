package ejem02_generandoStreams;

import java.util.Map;
import java.util.Properties;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.home"));
		System.out.println(p.getProperty("java.version"));
		
	/*	for (Map.Entry<Object, Object> entrada:  p.entrySet())
		{
			Object clave = entrada.getKey();
			Object valor = entrada.getValue();
			System.out.println(clave + " = " + valor);
		}*/
		
		p.entrySet().stream().filter(cadena->cadena.getKey().toString().startsWith("java")).forEach(System.out::println);
		
		
	}

}
