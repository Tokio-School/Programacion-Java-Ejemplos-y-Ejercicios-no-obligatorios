package DAO_Implementacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.h2.tools.RunScript;
import org.h2.tools.Script;

import dao_interface.DAO_Persona;
import modelo.Persona;

public class DAO_Persona_MySQL implements DAO_Persona {

	Connection conexion;
	/*String url = "jdbc:mysql://localhost:3306/personas";
	String userBD="root";
	String pass="";*/
	
	String url = "jdbc:h2:./src/main/resources/personas";
	String userBD="sa";
	String pass="";
	
	
	public DAO_Persona_MySQL() {
        try {
			conexion = DriverManager.getConnection(url, userBD, pass);
        	//conexion=DataSourceBD.getConnection();
			System.out.println("Conexion establecida."+conexion);
			
			// Exportar la base de datos a un archivo
			//Script.process(url, userBD, pass, "personas-hikari.sql","","");
			// Importar la base de datos desde un archivo
			/*try {
				RunScript.execute(conexion, new FileReader("personas-hikari.sql"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	@Override
	public ArrayList<Persona> listar() {
		String consulta="SELECT * FROM personas";
		ResultSet rs;
		ArrayList<Persona> personas= new ArrayList<>();;
		try {
			PreparedStatement ps = conexion.prepareStatement(consulta);
			rs=ps.executeQuery();
		
			
			while (rs.next()) {
				personas.add(new Persona(rs.getString("nombre"), rs.getInt("edad"), rs.getDouble("salario")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return personas;
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		String insercion="INSERT INTO personas (nombre, edad, salario) VALUES (?, ?, ?)";
		try {
			PreparedStatement ps=conexion.prepareStatement(insercion);
			ps.setString(1, persona.getNombre());
			ps.setInt(2, persona.getEdad());
			ps.setDouble(3, persona.getSalario());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void borrar(Persona persona) {
		// TODO Auto-generated method stub
		String borrado="DELETE FROM personas WHERE nombre=?";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(borrado);
			ps.setString(1, persona.getNombre());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona buscarPorId(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public void guardar() {
		// TODO Auto-generated method stub
		
	}

}
