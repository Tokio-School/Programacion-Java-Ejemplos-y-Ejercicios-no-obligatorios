
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad=18;
		byte edad2=127;
		
		int numero=123456;
		
		System.out.println(edad);
		
		float altura=1.75f;
		
		char letraA1='a';
		char letraA2=97;
		System.out.println(letraA1+"-"+letraA2);
		
		boolean esMayor=false;
		System.out.println(esMayor);
		
		
		String nombre="Juan " + "Iglesias Pérez";
		System.out.println(nombre);
		
		System.out.print("Hola me llamo\n Víctor");
		System.out.println("El caracter de escape \\ sirve para poner \\n que significa salto de línea");
		
		
		String nombre2="Juan";
		String apellidos="Iglesias Pérez";
		System.out.println(nombre2+" "+apellidos);
		
		int num1=10;
		int num2=2;
		int suma=num1+num2;
		System.out.println(suma);
		int resta=num1-num2;
		System.out.println(resta);
		int multiplicacion=num1*num2;
		int division=num1/num2;
		int resto=num1%num2;
		System.out.println(resto);
		int numero2=20;
		int resto2=numero2%2;
		// Si esto es 0 el número es par. Si es 1 el número es impar
		
		// Conversión entre tipos.
		byte edad3=18;
		int edad4=edad3;
		// error de compilación: byte edad5=edad4;
		String numeroTipoTexto="123";
		int numeroDeTexto=Integer.valueOf(numeroTipoTexto);
		System.out.println(numeroDeTexto*3);
		
		String otraCadena=String.valueOf(numeroDeTexto);
		System.out.println(otraCadena);
		
		
	}

}
