package modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// TODO: Auto-generated Javadoc
/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString

/**
 * Instantiates a new persona.
 *
 * @param nombre the nombre
 * @param edad the edad
 * @param salario the salario
 */
@AllArgsConstructor

/**
 * Instantiates a new persona.
 */
@NoArgsConstructor

/**
 * Gets the salario.
 *
 * @return the salario
 */
@Getter

/**
 * Sets the salario.
 *
 * @param salario the new salario
 */
@Setter
public class Persona {
	
	/** The nombre. */
	private String nombre;
	
	/** The edad. */
	private int edad;
	
	/** The salario. */
	private double salario;

}
