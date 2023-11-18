package ejem02_InterfazFuncional;

public class ApliacionUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario pedro=new Usuario("Pedro", 33);
		
		System.out.println(pedro);
		
		CreacionUsuarios gestionUsuarios=Usuario::new;
		Usuario victor=gestionUsuarios.crearUsuario("Victor", 18);
		System.out.println(victor);
		
	}
}
