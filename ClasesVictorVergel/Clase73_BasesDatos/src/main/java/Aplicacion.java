import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Aplicacion {

	private static final String URL = "jdbc:h2:./src/main/resources/bd_prueba";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager.getConnection(URL, "sa", "");)
		{
			
			//inicializarBD(con);
			
			
			Statement stmt = con.createStatement();	
			stmt.execute("CREATE TABLE IF NOT EXISTS PERSONAS2 (ID INT PRIMARY KEY, NOMBRE VARCHAR(255))");
			//stmt.execute("INSERT INTO PERSONAS2 VALUES (1, 'JUAN')");
			//stmt.execute("INSERT INTO PERSONAS2 VALUES (1, 'PEDRO')");
					
			/*ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONAS");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("nombre")
				+ " " + rs.getString("apellido") + " " + rs.getInt("edad") + " " + rs.getInt("departamento_id"));
			}
			
			ResultSet rs2 = stmt.executeQuery("SELECT * FROM Departamentos");
			while (rs2.next()) {
				System.out.println(rs2.getInt("id") + " " + rs2.getString("nombre"));
			}*/
			
			
			//PreparedStatement ps = con.prepareStatement("SELECT * FROM Departamentos WHERE id > ?");
			//ps.setInt(1, 2);
			
			//PreparedStatement ps = con.prepareStatement("SELECT * FROM Departamentos WHERE nombre like '?%'");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM Departamentos WHERE nombre = ? ");
			ps.setString(1, "Marketing");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			//System.out.println(rsmd.getColumnCount());
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println(rsmd.getColumnName(i)+" - "+rsmd.getColumnTypeName(i));
			}

			
			
			/*while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("nombre"));
			}*/
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void inicializarBD(Connection con) {
		// TODO Auto-generated method stub
		
		try (
			InputStream is=Aplicacion.class.getResourceAsStream("Script.sql");
			InputStreamReader isr = new InputStreamReader(is);
			
			BufferedReader br = new BufferedReader(isr);
		)
		{
			Statement stmt=con.createStatement();
			StringBuilder sb = new StringBuilder();
			String linea;
			while ((linea = br.readLine()) != null) {
				sb.append(linea);
				if (linea.endsWith(";")) {
					stmt.execute(sb.toString());
					sb.setLength(0);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
