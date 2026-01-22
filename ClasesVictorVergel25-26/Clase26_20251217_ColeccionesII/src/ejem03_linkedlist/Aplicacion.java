package ejem03_linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) {
		List<Usuario> listadoUsuarios = new LinkedList<Usuario>();
		listadoUsuarios.add(new Usuario("Juan", "juan@gmail.com"));
		listadoUsuarios.add(new Usuario("Ana", "ana@gmail.com"));
		System.out.println(((LinkedList<Usuario>)listadoUsuarios).offer(new Usuario("Pepe","pepe@gmail.com")));
		/*Collections.sort(listadoUsuarios, new Comparator<Usuario>() {
		    @Override
		    public int compare(Usuario u1, Usuario u2) {
		        return u1.getNombre().compareTo(u2.getNombre());
		    }
		});*/
		System.out.println(listadoUsuarios);
		Collections.sort(listadoUsuarios, (Usuario u1, Usuario u2)-> {
		        return u1.getNombre().compareTo(u2.getNombre());
		});
		System.out.println(listadoUsuarios);
		
		

	}

}

