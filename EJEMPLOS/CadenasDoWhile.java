package ud04;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		
		String nombre;
        String apellidos;
        String contrasena;
        boolean gustaJava = false;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce tu nombre: ");
            nombre = teclado.nextLine();
        } while (nombre.isEmpty());
        do {
            System.out.print("Introduce tu apellidos: ");
            apellidos = teclado.nextLine();
        } while (apellidos.isEmpty());
        do {
            System.out.print("Crea una contraseña (4 digitos mínimo): ");
            contrasena = teclado.nextLine();
        } while (contrasena.length() < 4);

        System.out.println("¿Te gusta Java? [si/NO]");
        String respuesta = teclado.nextLine();
        if (respuesta.equals("si"))
            gustaJava = true;

        System.out.println("Te llamas " + nombre + " " + apellidos);
        if (gustaJava)
            System.out.println("Te gusta Java");
        else
            System.out.println("No te gusta Java");
		
	}

}
