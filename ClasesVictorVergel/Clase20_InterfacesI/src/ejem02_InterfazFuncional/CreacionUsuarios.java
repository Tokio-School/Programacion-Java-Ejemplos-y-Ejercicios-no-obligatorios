package ejem02_InterfazFuncional;

@FunctionalInterface
public interface CreacionUsuarios {
	Usuario crearUsuario(String nombre, int edad);
}
