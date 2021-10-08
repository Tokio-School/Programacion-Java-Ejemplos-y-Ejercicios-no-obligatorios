package ud03;

public class EjemploContinue {

	public static void main(String[] args) {
		
		int x = 10;
        while (x < 20) {
            x++;
            System.out.println("aqui si");
            if (x % 2 == 0)
                continue;

            System.out.println(x);
        }

        int[] notas = new int[]{10, 2, 6, -1, 8};
        int media = 0;
        int numeroNotas = 0;
        for (int nota : notas) {
            System.out.println("Nota entrega " + nota);

            if (nota == -1)
                continue;

            media += nota;
            numeroNotas++;
        }
        media /= numeroNotas;

        System.out.println("La media de tus ejercicios es " + media);

	}

}
