package ejem01_priority;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Aplicacion {

	public static void main(String args[])
	{
		//PriorityQueue<Integer> colaPrioritaria=new PriorityQueue<Integer>();
		//PriorityQueue<Integer> colaPrioritaria=new PriorityQueue<Integer>(Comparator.reverseOrder());
		// Queremos ahora ordenar la cola, primero los que son impares
		PriorityQueue<Integer> colaPrioritaria=new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				if ((num1%2 != 0) && (num2%2 != 0) )
					return Integer.compare(num1, num2);
				else if (num1%2 !=0)
					return -1;
				else if (num2%2 !=0)
					return 1;
				else 
					return Integer.compare(num1, num2);
			}
		});
		colaPrioritaria.add(7);
		colaPrioritaria.add(70);
		colaPrioritaria.add(16);
		colaPrioritaria.add(3);
		colaPrioritaria.add(8);
		
		System.out.println(colaPrioritaria);
		colaPrioritaria.add(1);
		System.out.println(colaPrioritaria);
		colaPrioritaria.add(9);
		System.out.println(colaPrioritaria);
		colaPrioritaria.add(2);
		System.out.println(colaPrioritaria);
		for (Iterator iterator = colaPrioritaria.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		System.out.println(colaPrioritaria);
		
		System.out.println("--------------");
		System.out.println( colaPrioritaria.poll());
		System.out.println( colaPrioritaria.poll());
		System.out.println( colaPrioritaria.poll());
		System.out.println( colaPrioritaria.poll());
		System.out.println( colaPrioritaria.poll());
		System.out.println( colaPrioritaria.poll());
		System.out.println( colaPrioritaria.poll());
		System.out.println( colaPrioritaria.poll());

		System.out.println(colaPrioritaria);
		
		
		
	}
	
	
}
