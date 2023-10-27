package Ejem01_hascode;

class Empleado {
    private String nombre;
    private int empleadoId;

    public Empleado(String nombre, int empleadoId) {
        this.nombre = nombre;
        this.empleadoId = empleadoId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empleadoId;
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
        Empleado other = (Empleado) obj;
        if (empleadoId != other.empleadoId)
            return false;
        return true;
    }
}

