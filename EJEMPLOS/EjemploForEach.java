package ud03;

public class EjemploForEach {

	public static void main(String[] args) {


		String[] productos = new String[]{"uno", "dos", "tres", "cuatro"};

        // Con for each
        for (String producto : productos) {
            System.out.println(producto);
        }

        // Con bucle for
        for (int i = 0; i < productos.length; i = i + 2) {
            System.out.println(productos[i]);
        }

	}

}
