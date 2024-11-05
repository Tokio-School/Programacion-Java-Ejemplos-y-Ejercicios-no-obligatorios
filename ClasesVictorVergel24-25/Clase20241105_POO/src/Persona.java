
public class Persona {
	
	String nombre;
	int edad;
	double altura;
	String ciudadNacimiento;
	
	
	Persona(String nombre, int edad, double altura, String ciudadNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.ciudadNacimiento = ciudadNacimiento;
	}
	
	Persona(String nombre) {
		this.nombre = nombre;
	}
	
	void caminar(){
		System.out.println("Soy "+this.nombre+" y estoy caminando");
	}

	
	String saludar(Persona persona)
	{
		return "Hola "+persona.nombre+" soy "+this.nombre;
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}

	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

	@Override
	public String toString() {
		return "Persona ===> [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", ciudadNacimiento="
				+ ciudadNacimiento + "]";
	}
	
	
	
	
	

	
	
	
	
}
