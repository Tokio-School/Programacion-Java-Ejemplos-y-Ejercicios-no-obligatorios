
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private double salario;

    public Persona(int id, String nombre, int edad, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Persona(String nombre, int edad, double salario) {
        this(0, nombre, edad, salario);
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getSalario() { return salario; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return id + ": " + nombre + " (" + edad + " años, " + salario + " €)";
    }
}
