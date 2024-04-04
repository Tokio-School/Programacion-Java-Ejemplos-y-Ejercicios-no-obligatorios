package interfaz_usuario;

import modelo.Usuario;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo"+args[0]);
		
		//java Aplicacion hola
		Usuario pedro=new Usuario("Pedro","Perez",30);
		System.out.println(pedro.toString());
		
	}

}
