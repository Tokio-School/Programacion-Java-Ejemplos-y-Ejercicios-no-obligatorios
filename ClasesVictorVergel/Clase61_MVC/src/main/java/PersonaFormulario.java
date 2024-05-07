	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.lang.reflect.Field;

	public class PersonaFormulario extends JFrame {

	    public PersonaFormulario() {
	        setTitle("Formulario de Persona");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
     
	        JPanel panel = new JPanel(new GridLayout(10, 2, 80, 2)); // 10 filas, 2 columnas, espacio horizontal y vertical entre celdas

	        // Etiquetas
	        JLabel[] labels = new JLabel[]{
	                new JLabel("Nombre:"),
	                new JLabel("Edad:"),
	                new JLabel("Altura:"),
	                new JLabel("Peso:"),
	                new JLabel("Sexo:"),
	                new JLabel("Dirección:"),
	                new JLabel("Teléfono:"),
	                new JLabel("Email:"),
	                new JLabel("Profesión:")
	        };

	        // Campos de texto
	        JTextField[] textFields = new JTextField[labels.length];

	        for (int i = 0; i < labels.length; i++) {
	            panel.add(labels[i]);
	            textFields[i] = new JTextField();
	            //textFields[i].setActionCommand(labels[i].getText());
	            panel.add(textFields[i]);
	        }

	        // Botón para guardar
	        JButton btnGuardar = new JButton("Guardar");
	        btnGuardar.addActionListener((ActionEvent e) -> {
	            try {
	                // Crear una instancia de Persona
	                Class<?> personaClass = Class.forName("Persona");
	                Object persona = personaClass.getDeclaredConstructor().newInstance();

	                // Acceder a los campos de la clase Persona mediante reflexión
	                Field[] fields = personaClass.getDeclaredFields();
	                for (int i = 0; i < fields.length; i++) {
	                    Field field = fields[i];
	                    field.setAccessible(true); // Permitir acceso a campos privados

	                    // Obtener el valor del campo de texto correspondiente
	                    String valor = textFields[i].getText();

	                    // Convertir y asignar el valor al atributo de la persona
	                    if (field.getType() == int.class) {
	                        field.setInt(persona, Integer.parseInt(valor));
	                    } else if (field.getType() == double.class) {
	                        field.setDouble(persona, Double.parseDouble(valor));
	                    } else {
	                        field.set(persona, valor);
	                    }
	                }

	                // Mostrar los datos de la persona
	                System.out.println(persona.toString());
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        });
	        
	        btnGuardar.setHorizontalAlignment(SwingConstants.CENTER);
	        panel.add(btnGuardar);
	        
	        getContentPane().add(panel);
	        pack();
	        setLocationRelativeTo(null);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new PersonaFormulario().setVisible(true));
	    }
	}

	class Persona {
	    private String nombre;
	    private int edad;
	    private double altura;
	    private double peso;
	    private String sexo;
	    private String direccion;
	    private String telefono;
	    private String email;
	    private String profesion;

	    public Persona() {
	    }

	    public Persona(String nombre, int edad, double altura, double peso, String sexo, String direccion, String telefono, String email, String profesion) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.altura = altura;
	        this.peso = peso;
	        this.sexo = sexo;
	        this.direccion = direccion;
	        this.telefono = telefono;
	        this.email = email;
	        this.profesion = profesion;
	    }

	    @Override
	    public String toString() {
	        return "Persona{" +
	                "nombre='" + nombre + '\'' +
	                ", edad=" + edad +
	                ", altura=" + altura +
	                ", peso=" + peso +
	                ", sexo='" + sexo + '\'' +
	                ", direccion='" + direccion + '\'' +
	                ", telefono='" + telefono + '\'' +
	                ", email='" + email + '\'' +
	                ", profesion='" + profesion + '\'' +
	                '}';
	    }
	}

