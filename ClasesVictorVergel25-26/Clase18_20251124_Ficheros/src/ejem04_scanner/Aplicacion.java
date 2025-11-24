package ejem04_scanner;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		/*Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = teclado.nextInt();
		System.out.println("El número introducido es: " + numero);*/
		//try (Scanner fichero=new Scanner(Paths.get("datos2.txt"));){
		try (InputStream is=Aplicacion.class.getResourceAsStream("/datos2.txt");
			Scanner fichero=new Scanner(is);)
		{
			while (fichero.hasNextLine()) {
				String linea = fichero.nextLine();
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
