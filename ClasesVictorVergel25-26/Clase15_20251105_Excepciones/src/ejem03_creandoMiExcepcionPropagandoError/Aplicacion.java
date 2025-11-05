package ejem03_creandoMiExcepcionPropagandoError;

public class Aplicacion {

	public static void main(String[] args) {
		Banco banco = new Banco(1000);
		System.out.println(banco);
		try {
			banco.retirar(500);
			System.out.println(banco);
			banco.retirar(500);
			System.out.println(banco);
			banco.retirar(500);
			System.out.println(banco);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error al retirar: " + e.getMessage());
		}

	}

}
