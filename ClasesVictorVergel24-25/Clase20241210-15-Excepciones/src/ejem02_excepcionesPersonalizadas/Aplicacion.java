package ejem02_excepcionesPersonalizadas;

import java.util.Scanner;

public class Aplicacion {
	public static void main(String[] args) {
		Banco banco = new Banco(1000);
		System.out.println(banco);
		try {
			banco.retirar(100);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(banco);
		
		
			try (Scanner scanner = new Scanner(System.in);) {
				boolean retiradaCorrecta;
				do {
					retiradaCorrecta=true;
					System.out.println("Introduce la cantidad a retirar (0 para salir):");
					String cantidad = scanner.nextLine();
					try {
						banco.retirar(Integer.parseInt(cantidad));
					} catch (SaldoInsuficienteException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						retiradaCorrecta=false;
					}
				} while (!retiradaCorrecta);	
				//banco.retirar(950);
			} 
		
		System.out.println(banco);
	}
}
