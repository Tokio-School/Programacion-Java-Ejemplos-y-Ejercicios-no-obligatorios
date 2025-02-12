package ejem00_iniciandocolecciones;
import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> datos=new ArrayList<String>();
		datos.add("Juan");
		datos.add("Pedro");
		datos.add("Maria");
		System.out.println("----");
		for (int i = 0; i < datos.size(); i++) {
			System.out.println("Dato: "+datos.get(i));
		}
		System.out.println("----");
		for (String dato : datos) {
			System.out.println("Dato: " + dato);
		}
		System.out.println("----");
		//for (Iterator iterator = datos.iterator(); iterator.hasNext();) {
		Iterator<String> iterator = datos.iterator();
		while(iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println("Dato: "+string);
		}

		
	}

}
