import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ejem01_interfazFuncionalComparable {
	public static void main(String args[])
	{
		Persona p1 = new Persona("Juan", "20");
		Persona p2 = new Persona("Pedro", "30");
		Persona p3 = new Persona("Ana", "25");
		Persona[] lista = {p1, p2, p3};
		
		
		System.out.println(Arrays.toString(lista));
		
		/*Arrays.sort(lista, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                return p1.getNombre().compareTo(p2.getNombre());
            }
		});*/
		Arrays.sort(lista, (Object o1, Object o2) -> {
				// TODO Auto-generated method stub
                Persona persona1 = (Persona) o1;
                Persona persona2 = (Persona) o2;
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
		);
		
		System.out.println(Arrays.toString(lista));
		
		/*Arrays.sort(lista, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                return p1.getEdad().compareTo(p2.getEdad());
            }
		});*/

		Arrays.sort(lista, (Object o1, Object o2) ->{
				// TODO Auto-generated method stub
                Persona pe1 = (Persona) o1;
                Persona pe2 = (Persona) o2;
                return pe1.getEdad().compareTo(pe2.getEdad());
            }
		);
		System.out.println(Arrays.toString(lista));
		
	}

}
