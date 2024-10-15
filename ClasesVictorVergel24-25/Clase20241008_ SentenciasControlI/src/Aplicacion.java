import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 08/10/2024
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		
		
		int numero1=teclado.nextInt();
		
		if (numero1 == 0) 
			System.out.println("El número es el cero");
		else if (numero1 > 0) 
				System.out.println("El número es positivo");
			 else
				System.out.println("El número es negativo");

		System.out.println("Fin del programa");
		
		
		
		// 0-14 infantil, 15-18 jovenil, 18-25 joven, 25-60 adulto, 60-99 jubilado
		int edad=61;
		/*if (edad < 15)
			System.out.println("Infantil");
		else if (edad < 19)
			System.out.println("Jovenil");
		else if (edad < 26)
			System.out.println("Joven");
		else if (edad < 61)
			System.out.println("Adulto");
		else
			System.out.println("Jubilado");*/
		
		switch (edad) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Infantil");
				break;
			case 15-18:
				System.out.println("Juvenil");
				break;
	        case 19,20,21,22,23,24,25:
	        	System.out.println("Joven");
	        	break;
	        case 26,60:
				System.out.println("Adulto");
				break;
	        case 61,99:
                System.out.println("Jubilado");
                break;
            default:
				System.out.println("Edad no válida");
				break;
		}
		
		String mes="Agosto";
		
		switch (mes) {
			case "Enero","Noviembre","Diciembre","Febrero": {
				System.out.println("Invierno");
				break;
			}
			case "Marzo", "Abril", "Mayo", "Junio": {
				System.out.println("Primavera");
				break;
			}
			case "Julio", "Agosto", "Septiembre": {
				System.out.println("Verano");
				break;
			}
			case "Octubre": {
				System.out.println("Otoño");
				break;
			}
		}
		
		
		
		int salario=(edad>=18)?2000:100;
		if (edad >= 18)
			salario = 2000;
		else
			salario = 100;
		
		
		
		
		
		
		
	}

}
