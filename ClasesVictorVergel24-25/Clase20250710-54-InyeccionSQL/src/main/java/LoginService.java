import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginService {

	String url="jdbc:h2:./data/BDusuarios";
	String user="";
	String password="";
	Connection conexion ;
	
	public LoginService() {
		
		//Pablo no le aparece el desplegable.
		try {
			conexion = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean validateUser(String username, String password) {

		Statement stmt = null;
		try {
			stmt = conexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'";
		System.out.println(sql);
		try {
			ResultSet rs=stmt.executeQuery(sql);
			if (rs.next()) {
				return true; // Usuario encontrado
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false; // Usuario no encontrado
		
		
	}
	public boolean validateUser2(String username, String password) {
		
		try {
			PreparedStatement pstmt = conexion.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			System.out.println(pstmt.toString());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true; // Usuario encontrado
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false; // Usuario no encontrado
		
	}

	/*public void guardarDatos(String text, String text2, LocalDate value) {
		// TODO Auto-generated method stub
		
	}*/

}
