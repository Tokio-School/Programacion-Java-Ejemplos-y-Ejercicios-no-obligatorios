package ejem02_colecciones;

import java.util.HashMap;
import java.util.TreeMap;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profe1 = new Profesor("Victor", 8383929);
		Profesor profe2= new Profesor("María", 83832929);
		Profesor profe3 = new Profesor("Lucas", 83839219);
		Profesor profe4 = new Profesor("Marta", 83183929);
		Profesor profe5 = new Profesor("Daniel", 0);
		
		
		//HashMap<Integer,Profesor> mapa = new HashMap<>();
		TreeMap<Integer,Profesor> mapa = new TreeMap<>();
		mapa.put(profe1.getDni(), profe1);
		mapa.put(profe2.getDni(), profe2);
        mapa.put(profe3.getDni(), profe3);
        mapa.put(profe4.getDni(), profe4);
        mapa.put(profe5.getDni(), profe5);
        //mapa.put(profe5.getDni(), profe1);
		
		for (Profesor profe : mapa.values()) {
			System.out.println(profe);
		}
		System.out.println("*********************************");
		for (Integer dni : mapa.keySet()) {
			System.out.println(mapa.get(dni));
		}
		
		
	}

}
