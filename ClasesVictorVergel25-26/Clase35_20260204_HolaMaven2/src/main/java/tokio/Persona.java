package tokio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona. Esta clase representa una persona con atributos basicos. 
 * 
 * 
 * 
 * @author Victor Vergel (visita nuestra web <a href="https://tokioschool.com">Tokio School </a> )
 * @version 1.0
 * @since 2024-02-04
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Persona {
	
	/**
	 * Saludar. Metodo que permite a la persona saludar a otra persona.
	 *
	 * @param otraPersona the otra persona éste sería el parámetro que recibe el método y al cual saludamos
	 * @return the string Cadena de texto con el saludo de la persona
	 */
	public String saludar(Persona otraPersona) {
		return "Hola, mi nombre es " + this.nombre + ", tengo " + this.edad + " años y vivo en " + this.direccion + ".";
	}
	
	
	/** The nombre. Atributo que marca el nombre de la Persona representada*/
	private String nombre;
	
	/** The edad. Edad de la persona representada*/
	private int edad;
	
	/** The direccion. */
	private String direccion;


	
}
