package paquete_inicial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona. Esta clase representa a una persona con sus atributos. Si <B>desea conocer más</B> sobre qué tipo de persona es posible almacenar visite:
 * <a href='https://dle.rae.es/persona?m=form' target='blank'>RAE</a>	
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Persona {
	
	/** The nombre. Normalmente nombre de pila de usuario. 
	 
	 *  */
	private String nombre;
	
	/** The apellido. Apellido del usuario*/
	private String apellido;
	
	/** The edad. */
	private int edad;
	

}
