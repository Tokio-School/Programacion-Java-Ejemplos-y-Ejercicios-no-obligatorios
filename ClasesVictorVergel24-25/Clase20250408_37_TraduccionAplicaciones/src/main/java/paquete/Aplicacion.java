package paquete;

import java.io.IOException;
import java.util.Properties;

public class Aplicacion {
	public static void main(String[] args) {
		
		//Properties propiedadesSistema=new Properties();
		
		System.out.println(System.getProperty("user.language"));
		
		Properties prop = new Properties();
		// Cargar archivo de progupiedades de la carpeta de recursos en español o ingles
		try {
			prop.load(paquete.Aplicacion.class.getResourceAsStream(System.getProperty("user.language")+".properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(prop.getProperty("saludo_inicial"));
		
		System.out.println(prop.getProperty("saludo_final"));
		

		
		
	}
}
