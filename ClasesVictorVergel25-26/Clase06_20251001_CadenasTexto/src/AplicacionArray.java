
public class AplicacionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] caracteres= {'H','o','l','a'};
		String[] caracteres2= {"H","o","l","a"};
		
		for(int i=0;i<caracteres.length;i++) {
			System.out.println(caracteres[i]);
		}
		
		String caracteres3=new String(caracteres);
		System.out.println(caracteres3);
		
		
		int numeros[]=new int[4];
		numeros[0]=10;
		numeros[1]=20;
		numeros[2]=30;
		numeros[3]=40;
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		String cadenaTextoLarga="Esta es una cadena de texto larga";
		String cadenasCortas[]=cadenaTextoLarga.split(" ");
		for(int i=0;i<cadenasCortas.length;i++) {
			System.out.println(cadenasCortas[i]);
		}
		metodoMostrarArrayChar(caracteres);	
		
		for(int i=0;i<args.length;i++) {
			System.out.println("-"+args[i]);
		}
		
	}
	
	
	public static void metodoMostrarArrayChar(char[] caracteres222) {
		System.out.println("--->"+String.valueOf(caracteres222));
	}

}
