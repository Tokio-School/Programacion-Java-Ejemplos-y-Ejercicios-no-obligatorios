import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(MENSAJE_INICIAL_SALUDO);
		//System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.language"));
		
		Properties prop = new Properties();
		// Cargar archivo de propiedades de la carpeta de recursos en español o ingles
		try {
			prop.load(Aplicacion.class.getResourceAsStream(System.getProperty("user.language")+".properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Convertir a mayusculas common.lang3
		System.out.println(StringUtils.upperCase(prop.getProperty("initial_message")));

		System.out.println(prop.getProperty("final_message"));
	}

}
