package Ejem01_hascode;

class MiObjeto {
    private int id;

    public MiObjeto(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class Ejemplo02 {
    public static void main(String[] args) {
        MiObjeto[] objetos = new MiObjeto[100];
        for (int i = 0; i < 100; i++) {
            objetos[i] = new MiObjeto(i);
        }

        MiObjeto objetoBuscado = new MiObjeto(42);
        int index = buscarObjetoEnArray(objetos, objetoBuscado);
        System.out.println("El objeto buscado está en la posición: " + index);
    }

    public static int buscarObjetoEnArray(MiObjeto[] array, MiObjeto target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].hashCode() == target.hashCode() && array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}

