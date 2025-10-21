package conlombok;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Persona {
	private String nombre;
	private int edad;
	
	public void setNombre(String nombre) {
		this.nombre = "Sr./Sra." +nombre;
	}
	private String dni;
	
	
	/*public Persona(String nombre, int edad, String dni) {
		super();
		nombre = nombre;
		edad = edad;
		dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}*/
	
	
	
}