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
        //PersonCreator creator = Persona::new;
    	PersonCreator creator2=new PersonCreator() {
			
			@Override
			public Persona create(String nombre) {
				// TODO Auto-generated method stub
				return new Persona(nombre);
			}
		};
    	PersonCreator creator =(nombre)->new Persona(nombre);
    	
        // Llamar al constructor a través de la referencia
        Persona persona = creator.create("Pedro");
        System.out.println(persona.toString());
    }
    
    @FunctionalInterface
    interface PersonCreator {
        Persona create(String nombre);
    }
}
