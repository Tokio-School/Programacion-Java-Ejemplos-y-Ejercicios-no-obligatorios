package ejem03_streamPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Juan","Rodriguez", 30));
		personas.add(new Persona("Maria","Perez", 25));
		personas.add(new Persona("Ana","Gomez", 40));
		personas.add(new Persona("Pedro","Lopez", 35));
		personas.add(new Persona("Sonia","Garcia", 20));
		
		Stream<Persona> streamPerson=personas.stream();
		//streamPerson.forEach(p->System.out.println(p));
		//streamPerson.forEach(System.out::println);
		
		/*Map<String,Persona> mapaPersonas=streamPerson.collect(Collectors.toMap(p->p.getNombre(), p->p));
		
		mapaPersonas.forEach((k,v)->System.out.println(k+"->"+v));*/
		
		List<Persona> aPartirDeStream = streamPerson
				.filter(p->p.getEdad()>30)
				.collect(Collectors.toList());
		
		
		for(Persona p:aPartirDeStream) {
			System.out.println(p);
		}
				
				
				/*.filter(new Predicate<Persona>() {
                    @Override
                    public boolean test(Persona t) {
                        return t.getEdad()>30;
                    }
                })*/
				

		
		
		
	}

}
