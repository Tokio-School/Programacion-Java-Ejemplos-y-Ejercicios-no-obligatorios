package ejem03_objetos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona ana = new Persona("Ana", 28);
		/*try (FileOutputStream fos = new FileOutputStream("personas.txt");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);	
				) {
			
			oos.writeObject(ana);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		URL url=Aplicacion.class.getClassLoader().getResource("personas.txt");
		System.out.println(url.getFile());
		try (
			FileInputStream fis = new FileInputStream(url.getFile());
			 ObjectInputStream ois = new ObjectInputStream(fis);	
				) {
			Persona p = (Persona) ois.readObject();
			System.out.println(p);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

}
