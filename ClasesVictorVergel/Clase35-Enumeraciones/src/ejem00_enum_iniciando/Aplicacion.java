package ejem00_enum_iniciando;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MisConstantes.ENERO);
		System.out.println(Meses.ENERO);
		
		/*try {
			System.out.println(Meses.obtenerPorNumero(88));
		}catch (IllegalArgumentException e)
		{
			System.out.println("error....");
		}*/
		try {
			System.out.println(Meses.obtenerPorNumero(88));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error....");
		}
		
		
		System.out.println(Meses.obtenerMesAletarorio());
		
		
	}

}
