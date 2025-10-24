import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		gato.setNombre("Michi");
		Perro perro = new Perro();
		perro.setNombre("Firulais");
		System.out.println(gato);
		System.out.println(perro);
		
		Persona<Perro> persona = new Persona();
		persona.setNombre("Juan");
		persona.setEdad(33);
		persona.setMascota(perro);
		persona.getMascota().ladrar();

		
		
		Persona<Gato> persona2 = new Persona();
		persona2.setNombre("Maria");
		persona2.setEdad(28);
		persona2.setMascota(gato);
		
		persona2.getMascota().maullar();
		
		Persona personas[]= {persona,persona2};
		
		/*Arrays.sort(personas); 
		*/
		Arrays.sort(personas,new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getEdad()-o2.getEdad();
			}
			
		});
		for (Persona p:personas) {
			System.out.println(p.getNombre());
		}
		
		
	}

}
