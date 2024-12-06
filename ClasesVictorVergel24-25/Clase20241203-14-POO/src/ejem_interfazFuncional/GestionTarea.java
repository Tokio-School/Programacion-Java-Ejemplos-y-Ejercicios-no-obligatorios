package ejem_interfazFuncional;

import java.util.ArrayList;

@FunctionalInterface
public interface GestionTarea {
	void ejecutar(Tarea tarea,ArrayList<Tarea> tareas);
}
