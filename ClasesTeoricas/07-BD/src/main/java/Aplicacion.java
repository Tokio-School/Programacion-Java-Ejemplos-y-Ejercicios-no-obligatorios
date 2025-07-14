
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

public class Aplicacion extends JFrame {
    private static final String DB_URL = "jdbc:h2:./data/BD";
    private static final String USER = "user";
    private static final String PASS = "";

    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField nombreField, edadField, salarioField;
    private JButton insertarBtn,  borrarBtn, refrescarBtn;

    public Aplicacion() {
        super("Gestión de Personas (H2 + Swing)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel(new Object[]{"ID", "Nombre", "Edad", "Salario"}, 0);
        table = new JTable(tableModel);

        nombreField = new JTextField(10);
        edadField = new JTextField(5);
        salarioField = new JTextField(7);

        insertarBtn = new JButton("Insertar");
      //  actualizarBtn = new JButton("Actualizar");
        borrarBtn = new JButton("Borrar");
        refrescarBtn = new JButton("Refrescar");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Edad:"));
        panel.add(edadField);
        panel.add(new JLabel("Salario:"));
        panel.add(salarioField);
        panel.add(insertarBtn);
        //panel.add(actualizarBtn);
        panel.add(borrarBtn);
        panel.add(refrescarBtn);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        insertarBtn.addActionListener(e -> insertarPersona());
        //actualizarBtn.addActionListener(e -> actualizarPersona());
        borrarBtn.addActionListener(e -> borrarPersona());
        refrescarBtn.addActionListener(e -> cargarPersonas());

        cargarPersonas();
    }

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    private void cargarPersonas() {
    	ArrayList<Persona> personas=new ArrayList<Persona>();
    	tableModel.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos
		Statement stmt = null;
		ResultSet rs = null;
		try (Connection conn = conectar()) {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM personas");
			
			while (rs.next()) {
				int id = rs.getInt("ID");
				String nombre = rs.getString("NOMBRE");
				int edad = rs.getInt("EDAD");
				double salario = rs.getDouble("SALARIO");
				Persona persona = new Persona(id, nombre, edad, salario);
				personas.add(persona);
				tableModel.addRow(new Object[]{id, nombre, edad, salario});
			}
		} catch (SQLException e) {
			mostrarError("Error al cargar personas: " + e.getMessage());
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					/* Ignorar */ }
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					/* Ignorar */ }
		}
		
		personas.forEach(persona -> System.out.println(persona.toString()));
		
    }

    private void insertarPersona() {
		String nombre = nombreField.getText().trim();
		String edadStr = edadField.getText().trim();
		String salarioStr = salarioField.getText().trim();

		if (nombre.isEmpty() || edadStr.isEmpty() || salarioStr.isEmpty()) {
			mostrarError("Todos los campos deben ser rellenados.");
			return;
		}

		try {
			int edad = Integer.parseInt(edadStr);
			double salario = Double.parseDouble(salarioStr);

			try (Connection conn = conectar();
					PreparedStatement pstmt = conn
							.prepareStatement("INSERT INTO personas (NOMBRE, EDAD, SALARIO) VALUES (?, ?, ?)")) {
				pstmt.setString(1, nombre);
				pstmt.setInt(2, edad);
				pstmt.setDouble(3, salario);
				pstmt.executeUpdate();
				cargarPersonas(); // Refrescar la tabla después de insertar
			}
		} catch (NumberFormatException e) {
			mostrarError("Edad y Salario deben ser números válidos.");
		} catch (SQLException e) {
			mostrarError("Error al insertar persona: " + e.getMessage());
		}

    }

    private void actualizarPersona() {
        int selectedRow = table.getSelectedRow();
        int id=(int)tableModel.getValueAt(selectedRow, 0);
                if (selectedRow == -1) {
                	            mostrarError("Debe seleccionar una persona para actualizar.");
                }
                String nombre = nombreField.getText().trim();
                try (Connection conn = conectar();){
                	PreparedStatement pstmt = conn.prepareStatement("UPDATE personas SET NOMBRE = ?, EDAD = ?, SALARIO = ? WHERE ID = ?"); 
            		pstmt.setString(1, nombre);
            		pstmt.setInt(2, Integer.parseInt(edadField.getText().trim()));
            		pstmt.setDouble(3, Double.parseDouble(salarioField.getText().trim()));
            		pstmt.setInt(4, (int) tableModel.getValueAt(selectedRow, 0));
            		pstmt.executeUpdate();
            		cargarPersonas(); // Refrescar la tabla después de actualizar
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
                
                
    }

    private void borrarPersona() {
		int selectedRow = table.getSelectedRow();
		if (selectedRow == -1) {
			mostrarError("Debe seleccionar una persona para borrar.");
			return;
		}

		int id = (int) tableModel.getValueAt(selectedRow, 0);
		try (Connection conn = conectar();
				PreparedStatement pstmt = conn.prepareStatement("DELETE FROM personas WHERE ID = ?")) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			tableModel.removeRow(selectedRow); // Eliminar la fila de la tabla
		} catch (SQLException e) {
			mostrarError("Error al borrar persona: " + e.getMessage());
		}
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
    	Aplicacion app = new Aplicacion();
        SwingUtilities.invokeLater(() -> app.setVisible(true));
        app.cargarPersonas();
        
        
    }
}
