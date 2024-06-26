package DAO_Implementacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import dao_interface.DAO_Persona;
import modelo.Persona;

public class DAO_Persona_MySQL implements DAO_Persona {

	Connection conexion;
	String url = "jdbc:mysql://localhost:3306/clase74";
	String userBD="root";
	String pass="";
	
	
	public DAO_Persona_MySQL() {
        try {
			conexion = DriverManager.getConnection(url, userBD, pass);
			System.out.println("Conexion establecida."+conexion);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	@Override
	public ArrayList<Persona> listar() {
		// TODO Auto-generated method stub
		return null;
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
