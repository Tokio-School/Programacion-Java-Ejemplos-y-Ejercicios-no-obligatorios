package Ejem00_treemap_anidado;
import java.util.ArrayList;

public class Calificacion {

    private Master master;
    private ArrayList<Double> notas;

    public Calificacion(Master master) {
        this.master = master;
        this.notas = new ArrayList<>();
    }

    public Master getMaster() {
        return master;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
    
}
