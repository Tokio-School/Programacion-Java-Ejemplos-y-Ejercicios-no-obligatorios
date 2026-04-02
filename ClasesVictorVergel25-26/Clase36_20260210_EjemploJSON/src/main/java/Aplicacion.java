

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import json.Alumno;
import tools.jackson.databind.ObjectMapper;

public class Aplicacion {

	public static void main(String[] args) {
		try (InputStream ficheroDatos=Aplicacion.class.getResourceAsStream("/alumnos.json");) {
			if (ficheroDatos==null) {
				System.out.println("No se ha encontrado el fichero de datos");
				return;
			}
			String json;
			Scanner scanFichero=new Scanner(ficheroDatos,"UTF-8");
			json=scanFichero.useDelimiter("\\A").next();
			
			
			ObjectMapper mapper=new ObjectMapper();
			ArrayList<Alumno> alumnos=mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Alumno.class));
			
			for (Alumno alumno:alumnos) {
				System.out.println(alumno);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		
		// Cargar configuración del sistema
		//Properties propEjecucion=new Properties(System.getProperties());
		Properties propEjecucion=new Properties();
		try {
			propEjecucion.load(Aplicacion.class.getResourceAsStream("/configuracion.properties"));
			System.out.println("Configuración del sistema:");
			propEjecucion.forEach((clave,valor)->System.out.println(clave+"="+valor));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(System.getProperty("desarrollo"));
		
		
		Properties props=new Properties();
		props.setProperty("user.language", "en");
		String lenguaje=System.getProperty("user.language");
		System.out.println("Idioma del sistema: "+lenguaje);
		
		try (InputStream ficheroDatos=Aplicacion.class.getResourceAsStream(lenguaje+".properties");) {
			if (ficheroDatos==null) {
				System.out.println("No se ha encontrado el fichero de datos");
				return;
			}
			props.load(ficheroDatos);
			
			System.out.println(props.getProperty("saludo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
