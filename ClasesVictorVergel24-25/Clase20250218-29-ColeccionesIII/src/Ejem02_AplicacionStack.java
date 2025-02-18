import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Ejem02_AplicacionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> pila = new Stack<Integer>();

		
		pila.push(38);
		pila.push(10);
		pila.push(50);
		pila.push(15);
		pila.push(25);
		
		
		Collections.reverse(pila);
		
		
		System.out.println("Pila");
		for (Iterator iterator = pila.iterator(); iterator.hasNext();) {
			System.out.println(pila.pop());
		}
		
		
		
		
	}

}
