package Ejem00_treemap_anidado;


public class Alumno implements Comparable<Alumno>, TokioSchool {

    private String nombre;
    private String id;
    private int edad;

    public Alumno(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return id;
    }

    public void setID(String nia) {
        this.id = nia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int compareTo(Alumno a) {
        if (this.id.compareTo(a.getID()) == 0)
            return 0;
        int comparacion = this.nombre.compareTo(a.getTokioName());
        if (comparacion == 0)
            comparacion = Integer.compare(this.edad, a.getEdad());;
        if (comparacion == 0)
            comparacion = this.id.compareTo(a.getID());
        return comparacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (id == null && other.id != null)
            return false;
        else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", nia=" + id + ", edad=" + edad + "]";
    }

	@Override
	public String getTokioName() {
		// TODO Auto-generated method stub
		return "Tokio"+nombre;
	}

}
