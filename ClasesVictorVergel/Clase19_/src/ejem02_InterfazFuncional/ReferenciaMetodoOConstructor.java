package ejem02_InterfazFuncional;
class Persona {
    private String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
    
}
public class ReferenciaMetodoOConstructor {

    public static void main(String[] args) {
        // Referenciar el constructor de Persona
        PersonCreator creator = Persona::new;
    	
    	
        // Llamar al constructor a través de la referencia
        Persona persona = creator.create("John Doe");
        System.out.println(persona.toString());
    }
    
    
    interface PersonCreator {
        Persona create(String nombre);
    }
}
