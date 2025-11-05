package ejem02_creandoMiExcepcion;

public class Aplicacion {

	public static void main(String[] args) {
		Banco banco = new Banco(1000);
		System.out.println(banco);
		banco.retirar(500);
		System.out.println(banco);
		banco.retirar(500);
		System.out.println(banco);
		banco.retirar(500);
		System.out.println(banco);

	}

}
