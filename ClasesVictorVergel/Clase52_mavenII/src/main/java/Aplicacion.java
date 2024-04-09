import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class Aplicacion.
 */
public class Aplicacion {

	
	/**
	 * The main method.
	 *
	 * @param args the arguments. Aquí puede ir los parámetros de entrada de la aplicación
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		StringUtils stringUtils = new StringUtils();
		System.out.println(stringUtils.capitalize("hola mundo"));
		System.out.println(stringUtils.center("victor", 50));
		
		Usuario usuario = new Usuario("Victor", "Hugo", 30);
		
		
		
		//System.getProperties().forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println(System.getProperty("desarrollo"));
	
		
		
		Properties prop = new Properties();
		try (InputStream resourceAsStream = Aplicacion.class.getClassLoader().getResourceAsStream("configuracion.properties");) {
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : configuracion.properties");
        }
		
		
		
		//System.getProperties().forEach((k, v) -> System.out.println(k + ":" + v));
		prop.forEach((k, v) -> System.out.println(k + ":" + v));

	}

}
