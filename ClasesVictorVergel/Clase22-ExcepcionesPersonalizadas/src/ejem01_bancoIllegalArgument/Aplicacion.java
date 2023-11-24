package ejem01_bancoIllegalArgument;

import java.util.ArrayList;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cliente> clientes=new ArrayList<Cliente>();
		clientes.add(new Cliente("Pedro", "3838"));
		clientes.add(new Cliente("Maria", "321"));
		clientes.add(new Cliente("Mario", "333"));
		clientes.add(new Cliente("Pedro", "9393"));
		
		Cuenta cuenta1=null;
		try {
			cuenta1 = new Cuenta(-3, clientes.get(0));
		} catch (ErrorSaldo e) {
			// TODO Auto-generated catch block
			System.out.println("***********");
			e.printStackTrace();
		}
		System.out.println(cuenta1);
//		try {
			cuenta1.retirar(21);
//		}
//		catch (ErrorSaldo e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		catch (NullPointerException e)
//		{
//			System.out.println("No podemos retirar dinero de una cuenta que no existe");
//		} 
		
		

		System.out.println(cuenta1);
		
		
		
	}

}
