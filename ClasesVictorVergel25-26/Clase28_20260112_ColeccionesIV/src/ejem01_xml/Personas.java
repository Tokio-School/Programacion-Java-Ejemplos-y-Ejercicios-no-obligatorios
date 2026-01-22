package ejem01_xml;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="personas")
public class Personas {
	@ElementList(name="persona", inline=true)
	private List<Persona> personas;

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Personas(List<Persona> personas) {
		super();
		this.personas = personas;
	}

	public Personas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
