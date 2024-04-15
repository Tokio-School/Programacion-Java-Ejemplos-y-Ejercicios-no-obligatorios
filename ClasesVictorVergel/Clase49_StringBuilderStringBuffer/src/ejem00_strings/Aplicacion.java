package ejem00_strings;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1="Hola mundo";
		String cadena2="Hola mundo";
		System.out.println(cadena1.hashCode()+"-"+cadena2.hashCode());
		if(cadena1==cadena2) 
            System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		if(cadena1.equals(cadena2)) 
            System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		
		
		String cadena3="Hola mundo";
		String cadena4="Hola ";
		System.out.println(cadena4.hashCode());
		cadena4+="mundo";
		System.out.println(cadena4);
		System.out.println(cadena3.hashCode()+"-"+cadena4.hashCode());
		
		if(cadena3==cadena4) 
            System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		if(cadena3.equals(cadena4)) 
            System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		
		System.out.println("*****************");
		String cadena5=new String("Hola mundo");
		String cadena6=new String("Hola mundo");
		System.out.println(cadena5.hashCode()+"-"+cadena6.hashCode());
		
		if(cadena5==cadena6) 
            System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		if(cadena5.equals(cadena6)) 
            System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		
		System.out.println("*****************");
		

		StringBuilder cadena7=new StringBuilder("Hola mundo");
		StringBuilder cadena8=new StringBuilder("Hola numdo");

		System.out.println(cadena7.hashCode()+"-"+cadena8.hashCode());
		
		if(cadena7==cadena8) 
            System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		if(cadena7.equals(cadena8)) 
            System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		
		
		
		
	}

}
