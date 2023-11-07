package ejem02_clases_parametrizadas_listas;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiLista<String,Persona> laLista=new MiLista<String,Persona>();
		laLista.agregar("Victor");
		System.out.println(laLista.obtener(0));
		
		MiLista<Persona,Persona> laLista2=new MiLista<Persona,Persona>();
		Persona victor=new Persona("Victor", "Vergel Rodriguez", 18);
		laLista2.agregar(victor);
		System.out.println(laLista2.obtener(0));
		
		
	}

}
