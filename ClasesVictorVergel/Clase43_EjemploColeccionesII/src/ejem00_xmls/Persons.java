package ejem00_xmls;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="persons")
public class Persons {
	
	@ElementList(inline = true, entry = "person")
	private List<Person> persons;

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Persons(List<Person> persons) {
		super();
		this.persons = persons;
	}
	public Persons() {
		super();
	}
	

}
