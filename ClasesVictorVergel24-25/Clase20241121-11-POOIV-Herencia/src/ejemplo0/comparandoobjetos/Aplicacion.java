package ejemplo0.comparandoobjetos;

import java.util.ArrayList;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro = new Perro();
		Gato gato = new Gato();
		
		
		
		Persona<Perro> p1 = new Persona<Perro>("Juan", 11,perro);
		Persona<Gato> p2 = new Persona<Gato>("Pedro", 20,gato);
		System.out.println("----"+p1);
		
		Persona personas [] = {p1, p2};
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(p1);
		lista.add(p2);
	/*	lista.add(new Persona("Ana", 15));
		lista.add(new Persona("Maria", 18));
		lista.add(new Persona("Luis", 22));*/
		
		

		for (int i = 0; i < lista.size(); i++) {
			//System.out.println(((Persona)lista.get(i)).getNombre());
			System.out.print(lista.get(i).getNombre()+" ");
			if (lista.get(i).getMascota() instanceof Perro) {
				((Perro) lista.get(i).getMascota()).ladra();
			} else if (lista.get(i).getMascota() instanceof Gato) {
				((Gato) lista.get(i).getMascota()).maullar();
			}
		}
		
		
		if (p1.compareTo(p2)==0) {
            System.out.println("Tienen la misma edad");
		} else if (p1.compareTo(p2) > 0) {
			System.out.println(p1.getNombre() + " es mayor que " + p2.getNombre());
		} else {
			System.out.println(p1.getNombre() + " es menor que " + p2.getNombre());
		}
		
		System.out.println("El mayor es: " + quienEsElMayor(lista).getNombre());
		
		
	}
	
	public static Persona quienEsElMayor(ArrayList<Persona> lista)
	{
		Persona mayor = lista.get(0);
		for (int i = 1; i < lista.size(); i++) {
			if (mayor.compareTo(lista.get(i)) < 0) {
				mayor = lista.get(i);
			}
		}
		return mayor;
		
	}
	

}
