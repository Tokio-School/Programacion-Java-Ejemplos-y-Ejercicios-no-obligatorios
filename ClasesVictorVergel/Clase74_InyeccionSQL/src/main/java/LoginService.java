import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class LoginService {
	/*private String url = "jdbc:h2:./src/main/resources/usuarios";
	private String user="sa";
	private String passwordBD="";*/
	
	private String url = "jdbc:mysql://localhost:3306/usuarios";
	private String user="root";
	private String passwordBD="";

	public void guardarDatos(String usuario, String password, LocalDate fecha) {
		// TODO Auto-generated method stub
		try(Connection connection = DriverManager.getConnection(url, user, passwordBD)){
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO usuarios (nombre, password, fecha) VALUES (?, ?, ?)");
			pstmt.setString(1, usuario);
			pstmt.setString(2, password);
			pstmt.setDate(3, java.sql.Date.valueOf(fecha));
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		// Problemas con ésta contraseaña ' OR '1'='1
		try(Connection connection = DriverManager.getConnection(url, user, passwordBD)){
			Statement stmt = connection.createStatement();
			String query = "SELECT * FROM usuarios WHERE nombre='"+username+"' AND password='"+password+"'";
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(query);
			if (rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}*/

	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		// Problemas con ésta contraseaña ' OR '1'='1
		try(Connection connection = DriverManager.getConnection(url, user, passwordBD)){
			String query = "SELECT * FROM usuarios WHERE nombre=? AND password=?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, password);
			
			
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(query);
			if (rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	  
}
