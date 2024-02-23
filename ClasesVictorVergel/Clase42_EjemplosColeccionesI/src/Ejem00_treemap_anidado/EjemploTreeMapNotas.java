package Ejem00_treemap_anidado;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMapNotas {

    static Map<Alumno, ArrayList<Calificacion>> notasAlumnos = new TreeMap<Alumno, ArrayList<Calificacion>>();

    public static void main(String[] args) {        

        Alumno alumno1 = new Alumno("Luis", "L1-Java-Android", 24);
        Alumno alumno2 = new Alumno("Maria", "L2-Java-Android", 21);
        Alumno alumno3 = new Alumno("Juan", "L3-Java-Android", 22);

        agregarNota(alumno1, Master.JAVA, 8.5);
        agregarNota(alumno1, Master.JAVA, 7.1);
        agregarNota(alumno1, Master.ANDROID, 7.1);
        agregarNota(alumno1, Master.ANDROID, 9.0);
        agregarNota(alumno1, Master.ANDROID, 7.5);

        agregarNota(alumno2, Master.JAVA, 9.5);
        agregarNota(alumno2, Master.JAVA, 8.0);
        agregarNota(alumno2, Master.ANDROID, 9.0);
        agregarNota(alumno2, Master.ANDROID, 7.5);

        agregarNota(alumno3, Master.JAVA, 7.5);
        agregarNota(alumno3, Master.JAVA, 8.0);
        agregarNota(alumno3, Master.JAVA, 8.5);
        agregarNota(alumno3, Master.ANDROID, 8.2);

        mostrarDatos();
    }

    public static void agregarNota(Alumno alumno, Master master, double nota) {
        ArrayList<Calificacion> calificacionesAlumno = notasAlumnos.get(alumno);
        if (calificacionesAlumno == null) {
            calificacionesAlumno = new ArrayList<>();
            notasAlumnos.put(alumno, calificacionesAlumno);
        }
        Calificacion calificacion = null;
        for (Calificacion c : calificacionesAlumno) {
            if (c.getMaster() == master) {
                calificacion = c;
                break;
            }
        }
        if (calificacion == null) {
            calificacion = new Calificacion(master);
            calificacionesAlumno.add(calificacion);
        }
        calificacion.getNotas().add(nota);
    }

    public static void mostrarDatos() {
        String s;
        for (Map.Entry<Alumno, ArrayList<Calificacion>> entry : notasAlumnos.entrySet()) {
            s = "";
            Alumno alumno = entry.getKey();
            ArrayList<Calificacion> calificaciones = entry.getValue();
            s += alumno.getTokioName() + "(" + alumno.getID() + ")\n";
            
            for (Calificacion calificacion : calificaciones) {
                String modulo = calificacion.getMaster().getNombre();
                ArrayList<Double> notas = calificacion.getNotas();
                
                s += modulo + " " + notas + " Promedio: "+promedioNotas(notas)+"\n";
            }
            System.out.println("\n"+s);
        }
    }

	private static String promedioNotas(ArrayList<Double> notas) {
		// TODO Auto-generated method stub
		double promedio=0;
		for (Double double1 : notas) {
			promedio+=double1;
		}
		return String.valueOf(promedio/notas.size());
	}
}
