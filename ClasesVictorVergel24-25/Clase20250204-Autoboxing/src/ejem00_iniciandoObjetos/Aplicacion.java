package ejem00_iniciandoObjetos;
import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) {
		int valor=0;
		System.out.println(valor);
		
		ArrayList<Integer> listas=new ArrayList<Integer>();
		
		int valor1=3;
		int valor2=3;
		if (valor1 == valor2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		
		Persona p1=new Persona("Juan");
		Persona p2=new Persona("Juan");
		if (p1==p2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		if (p1.equals(p2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		
		
		Integer valorInteger1=12;
		Integer valorInteger2=12;
		if (valorInteger1 == valorInteger2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		
		
		Integer valorInteger3=333;
		Integer valorInteger4=333;
		if (valorInteger3 == valorInteger4) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		
		String valorString1="Juan";
		String valorString2="Juan";
		if (valorString1 == valorString2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		
		
		
		Persona p3=new Persona("Juan");
	    Persona p4=new Persona();
	    p4.setNombre("Juan");
	    p4.setNombre("Juan", "Perez");
	    System.out.println(p4);
		

	}

}
