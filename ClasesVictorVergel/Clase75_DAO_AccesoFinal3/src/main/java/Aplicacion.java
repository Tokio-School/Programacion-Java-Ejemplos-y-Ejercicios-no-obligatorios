import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.h2.tools.Script;

import DAO_Implementacion.DAO_Persona_CSV;
import DAO_Implementacion.DAO_Persona_MySQL;
import DAO_Implementacion.DAO_Persona_json;
import DAO_Implementacion.DataSourceBD;
import modelo.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo");
		
		//DAO_Persona_CSV datos= new DAO_Persona_CSV();
		//DAO_Persona_json datos= new DAO_Persona_json();
		DAO_Persona_MySQL datos= new DAO_Persona_MySQL();
		
		datos.borrar(new Persona("Juan23", 23,1500));
		datos.listar().forEach(persona -> System.out.println(persona));
		
		System.out.println("----------------------------------");
		/*datos.insertar(new Persona("Juan23", 23,1500));
		datos.insertar(new Persona("Luis", 23,1500));*/
		
		/*datos.actualizar(new Persona("Luis", 24,1550));
		datos.borrar(new Persona("Juan23", 23,1500));
		
		
		datos.listar().forEach(persona -> System.out.println(persona));
		datos.guardar();*/
		
		
		try {
			DatabaseMetaData metadata = DataSourceBD.getConnection().getMetaData();
			String[] types = {"TABLE"};
			ResultSet resultSet = metadata.getTables(null, null, "%", types);
			while (resultSet.next()) {
				String tableCatalog = resultSet.getString("TABLE_CAT"); // Nombre de la base de datos (cat�logo)
		        String tableSchema = resultSet.getString("TABLE_SCHEM"); // Nombre del esquema
		        String tableName = resultSet.getString("TABLE_NAME"); // Nombre de la tabla
		        System.out.println("Base de datos: " + tableCatalog + ", Esquema: " + tableSchema + ", Tabla: " + tableName);
				
				// Obtener los metadatos de las columnas para la tabla actual
		        ResultSet columns = metadata.getColumns(tableCatalog, tableSchema, tableName, "%");
		        while (columns.next()) {
		            String columnName = columns.getString("COLUMN_NAME");
		            String columnType = columns.getString("TYPE_NAME");
		            int columnSize = columns.getInt("COLUMN_SIZE");
		            System.out.println("\tColumna: " + columnName + " - Tipo: " + columnType + "(" + columnSize + ")");
		        }
		        columns.close();
			}
			resultSet.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}