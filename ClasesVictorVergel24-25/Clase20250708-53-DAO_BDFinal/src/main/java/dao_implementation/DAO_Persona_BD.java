package dao_implementation;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;

import crud.CRUD_Persona;
import modelo.Persona;

public class DAO_Persona_BD implements CRUD_Persona {

	
	//String url = "jdbc:h2:.\\data\\ConexionBD";
	String url = "jdbc:mysql://localhost:3306/bd_mysql_prueba";
	Connection conexion = null;
	//String usuario = "user";
	String usuario = "root";
	String contrasena = "";
	
	public DAO_Persona_BD() {
		/*String ficheroBD=new File("data/ConexionBD.mv.db").getAbsolutePath();
		System.out.println("Fichero de base de datos: " + ficheroBD);
		System.out.println("Directorio de ejecución: " + System.getProperty("user.dir"));*/
		// Aquí se podría establecer la conexión a la base de datos
		try {
			conexion = DriverManager.getConnection(url, usuario, contrasena);
			
			
			/*DatabaseMetaData metaData = conexion.getMetaData();
			System.out.println("URL de conexión detectada: " + metaData.getURL());

			String rutaRelativa = "./data/ConexionBD.mv.db";
			File archivoBD = new File(rutaRelativa);

			System.out.println("¿Existe archivo?: " + archivoBD.exists());
			System.out.println("Ruta absoluta usada por H2: " + archivoBD.getAbsolutePath());*/
			
			
			DatabaseMetaData metaData = conexion.getMetaData();
			System.out.println("URL usada: " + metaData.getURL());
            ResultSet tablas = metaData.getTables(null, null, "%", new String[]{"TABLE"});

            System.out.println("Tablas encontradas:");
            while (tablas.next()) {
                String nombreTabla = tablas.getString("TABLE_NAME");
                System.out.println(" - " + nombreTabla);
            }

            tablas.close();
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("Conexión a la base de datos establecida.");
	}
	
	
	
	
	@Override
	public ArrayList<Persona> listarPersonas() {
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		// Aquí se implementaría la lógica para listar las personas desde la base de datos
		// Por ejemplo, ejecutar una consulta SQL y llenar la lista con los resultados
		try (Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM personas");){
			
			while (resultSet.next()) {
				String nombre = resultSet.getString("nombre");
				int edad = resultSet.getInt("edad");
				double salario = resultSet.getDouble("salario");
				listaPersonas.add(new Persona(nombre, edad, salario));
			}
			/*resultSet.close();
			statement.close();*/
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaPersonas;
	}

	@Override
	public Persona buscarPersona(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertarPersona(Persona persona) {
		// Aquí se implementaría la lógica para insertar una persona en la base de datos
		// Por ejemplo, ejecutar una consulta SQL de inserción
		try (Statement statement = conexion.createStatement()) {
			String sql = String.format(Locale.US,"INSERT INTO personas (nombre, edad, salario) VALUES ('%s', %d, %.2f)",
					persona.getNombre(), persona.getEdad(), persona.getSalario());
			int filasAfectadas = statement.executeUpdate(sql);
			return filasAfectadas > 0; // Retorna true si se insertó al menos una fila
		} catch (SQLException e) {
			e.printStackTrace();
			return false; // Retorna false si hubo un error
		}
	}

	@Override
	public boolean actualizarPersona(Persona persona) {

		try (Statement statement = conexion.createStatement()) {
			String sql = String.format(Locale.US, "UPDATE personas SET edad = %d, salario = %.2f WHERE nombre = '%s'",
					persona.getEdad(), persona.getSalario(), persona.getNombre());
			int filasAfectadas = statement.executeUpdate(sql);
			return filasAfectadas > 0; // Retorna true si se actualizó al menos una fila
		} catch (SQLException e) {
			e.printStackTrace();
			return false; // Retorna false si hubo un error
		}
	}

	@Override
	public boolean eliminarPersona(String nombre) {
		// Aquí se implementaría la lógica para eliminar una persona de la base de datos
		// Por ejemplo, ejecutar una consulta SQL de eliminación
		try (Statement statement = conexion.createStatement()) {
			String sql = String.format(Locale.US, "DELETE FROM personas WHERE nombre = '%s'", nombre);
			int filasAfectadas = statement.executeUpdate(sql);
			return filasAfectadas > 0; // Retorna true si se eliminó al menos una fila
		} catch (SQLException e) {
			e.printStackTrace();
			return false; // Retorna false si hubo un error
		}
	}

	public void cerrarConexion() {
		// Aquí se cerraría la conexión a la base de datos
		try {
			if (conexion != null && !conexion.isClosed()) {
				conexion.close();
				System.out.println("Conexión a la base de datos cerrada.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
