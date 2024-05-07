package controlador;

import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.swing.JTextField;

import modelo.PersonaFormulario;
import vista.Interfaz;
import vista.InterfazFormulario;

public class ControladorInterfazFormulario {

	InterfazFormulario interfaz;
	JTextField[] textFields;
	
	public ControladorInterfazFormulario(InterfazFormulario interfaz) {
		// TODO Auto-generated constructor stub
		this.interfaz = interfaz;
		textFields=this.interfaz.getTextFields();
		interfaz.getBtnGuardar().addActionListener(e -> guardar());
	}

	private void guardar() {
		try {
            // Crear una instancia de Persona
            Class<?> personaClass = Class.forName("modelo.PersonaFormulario");
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

           System.out.println(persona.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
	
}
