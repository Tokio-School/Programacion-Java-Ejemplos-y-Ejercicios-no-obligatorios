import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ejem01_interfazFuncionalComparable2 {
	public static void main(String args[])
	{
		Persona p1 = new Persona("Juan", "20");
		Persona p2 = new Persona("Pedro", "30");
		Persona p3 = new Persona("Ana", "25");
		Persona[] lista = {p1, p2, p3};
		
		Comparator comparacionPorNombre=(Object o1, Object o2) -> {
			// TODO Auto-generated method stub
            Persona persona1 = (Persona) o1;
            Persona persona2 = (Persona) o2;
            return persona1.getNombre().compareTo(persona2.getNombre());
        };
		System.out.println(Arrays.toString(lista));
		
		Arrays.sort(lista,comparacionPorNombre); 
		
		System.out.println(Arrays.toString(lista));
		
		Comparator comparacionPorEdad=(Object o1, Object o2) ->{
			// TODO Auto-generated method stub
            Persona pe1 = (Persona) o1;
            Persona pe2 = (Persona) o2;
            return pe1.getEdad().compareTo(pe2.getEdad());
        };

		Arrays.sort(lista, comparacionPorEdad);
		System.out.println(Arrays.toString(lista));
		
	}

}