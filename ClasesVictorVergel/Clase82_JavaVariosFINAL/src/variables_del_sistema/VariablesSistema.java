package variables_del_sistema;

public class VariablesSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String urlConexion="jdbc:mysql://localhost:3306/curso_java";
		String usuario="root";
		String password="admin";*/
		
		String urlConexion=System.getenv("URL_CONEXION");
		String usuario=System.getenv("USUARIO");
		String password=System.getenv("PASSWORD");
		String otra=System.getenv("otra");
		
		
		System.out.println("URL de conexión: "+urlConexion+" Usuario: "+usuario+" Password: "+password+"Otra: "+otra);
		
		
	}

}
