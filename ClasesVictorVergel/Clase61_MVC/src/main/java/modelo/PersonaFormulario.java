package modelo;

public class PersonaFormulario {
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String sexo;
    private String direccion;
    private String telefono;
    private String email;
    private String profesion;

    public PersonaFormulario() {
    }

    public PersonaFormulario(String nombre, int edad, double altura, double peso, String sexo, String direccion, String telefono, String email, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", profesion='" + profesion + '\'' +
                '}';
    }
}