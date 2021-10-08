package ud03;

public class EjemploBreak {

	public static void main(String[] args) {
		
		int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;

            if (i == 5)
                break;

            if (i == 9)
                break;

            System.out.println("aqui hay mas cosas");
        }

        System.out.println(i);

        for (int j = 0; j < 10; j++) {
            System.out.println(j);

            if (j > 4) {
                break;
            }
        }

	}

}
