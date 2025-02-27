package ejem02_xmls;

import java.util.Objects;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="person")
public class Person implements Comparable<Person>{
	@Element(name="name")
	private String nombre;
	@Element(name="age")
	private int edad;
	public String getName() {
		return nombre;
	}
	public void setName(String name) {
		this.nombre = name;
	}
	public int getAge() {
		return edad;
	}
	public void setAge(int age) {
		this.edad = age;
	}
	public Person(String name, int age) {
		super();
		this.nombre = name;
		this.edad = age;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + nombre + ", age=" + edad + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.nombre.equals(((Person)obj).nombre) && this.edad==((Person)obj).getAge();
	}
	
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(nombre, edad);
	}
	
	
	
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}

}
