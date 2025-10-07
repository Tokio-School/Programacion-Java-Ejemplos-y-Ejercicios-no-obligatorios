import java.util.ArrayList;
import java.util.Iterator;

public class AplicacionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lista = new ArrayList();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(1);
		for(int i=0;i<lista.size();i++) {
			System.out.println("Posicion "+i+" -> "+lista.get(i));
		}
		lista.remove(1);
		lista.remove(1);
		lista.remove(1);
		System.out.println("--- Despues de borrar ---");
		for(int i=0;i<lista.size();i++) {
			System.out.println("Posicion "+i+" -> "+lista.get(i));
		}
	}

}
