import javafx.beans.property.SimpleStringProperty;

public class Persona {
	public final SimpleStringProperty nombre ;
	public final SimpleStringProperty apellido ;
	
	
	public Persona(String nombre, String apellido) {
		this.nombre = new SimpleStringProperty(nombre);
		this.apellido = new SimpleStringProperty(apellido);
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre.get();
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido.get();
	}
	

	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}


	public void setApellido(String apellido) {
		this.apellido.set(apellido);
	}
	
	
}
