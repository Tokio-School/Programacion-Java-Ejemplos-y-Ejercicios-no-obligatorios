
public class AplicacionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Hola Mundo";
		String texto2=new String();
		String texto3=new String("Hola Mundo");
		
		System.out.println(texto.charAt(0));
		System.out.println(texto.length());
		
		int posicion=0;
		do {
			System.out.println(texto.charAt(posicion));
			posicion++;
		} while (posicion<texto.length());
		
		for(int i=0;i<texto.length();i++) {
			System.out.println(texto.charAt(i));
		}
		
		int valor=65;
		char letra=(char)valor;
		double decimal=65.0;
		
		String concatenacion=String.valueOf(valor)+" "+String.valueOf(letra)+" "+String.valueOf(decimal);
		System.out.println(concatenacion);
		
		
		String concatenacion2="";
		concatenacion2=(concatenacion2.concat(String.valueOf(valor))).concat(" ").concat(String.valueOf(letra)).concat(" ").concat(String.valueOf(decimal));
		System.out.println(concatenacion2);
		
		
		String texto4="Hola Mundo Java";
		
		// Buscar una subcadena dentro de una cadena
		if (texto4.indexOf("XJava")<0) 
			System.out.println("Error, no se encuentra la subcadena");
		else
			System.out.println("Si se encuentra la subcadena");
		
		if ("hola".equals("hola")) 
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
				
		String saludo1="hola";
		String saludo2="Hola";
		
		if (saludo1.equals(saludo2)) 
			System.out.println("1Son iguales");
		else
			System.out.println("1No son iguales");
		
		if (saludo1.equals("Hola"))	
			System.out.println("2Son iguales");
		else
			System.out.println("2No son iguales");
		
		if (saludo1==saludo2)	
			System.out.println("3Son iguales");
		else
			System.out.println("3No son iguales");
		
		if (saludo1.equalsIgnoreCase(saludo2))	
			System.out.println("4Son iguales");
		else
			System.out.println("4No son iguales");
		
		System.out.println(texto4.replace('a', '_'));
		
		
		
		
	}

}
