package ejem_interfazFuncionalRecord;

import java.util.ArrayList;

@FunctionalInterface
public interface GestionTarea {
	void ejecutar(Tarea tarea,ArrayList<Tarea> tareas);
}
