import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Ejem01_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> listaEnlazada = new LinkedList<Integer>();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		listaEnlazada.add(38);
		listaEnlazada.add(10);
		listaEnlazada.add(50);
		listaEnlazada.add(15);
		listaEnlazada.add(25);
		
		lista.addAll(listaEnlazada);
		
		
		listaEnlazada.add(2,33);
		
		System.out.println("Lista enlanzada");
		for (Iterator iterator = listaEnlazada.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println("Lista normal");
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		
		
	}

}
