package ejem02.objetos_datosprimitivos;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer
		// Crear un objeto Integer
		Integer entero = Integer.valueOf(42);

		// Obtener el valor primitivo
		int valorPrimitivo = entero.intValue();

		// Realizar operaciones con el valor envuelto
		int suma = entero + 10;

		// Trabajar con valores nulos
		Integer nuloInteger = null;

		
		//Character
		// Crear un objeto Character
		Character caracter = Character.valueOf('A');

		// Obtener el valor primitivo
		char valorPrimitivoCharacter = caracter.charValue();

		// Realizar operaciones con el valor envuelto
		char siguienteCaracter = (char) (caracter + 1);

		// Trabajar con valores nulos
		Character nuloCharacter = null;
		
		
		//Boolean
		// Crear un objeto Boolean
		Boolean booleano = Boolean.valueOf(true);

		// Obtener el valor primitivo
		boolean valorPrimitivoBoolean = booleano.booleanValue();

		// Realizar operaciones con el valor envuelto
		boolean negacion = !booleano;

		// Trabajar con valores nulos
		Boolean nuloBoolean = null;

		
		
		//Double
		// Crear un objeto Double
		Double doble = Double.valueOf(3.14);

		// Obtener el valor primitivo
		double valorPrimitivoDouble = doble.doubleValue();

		// Realizar operaciones con el valor envuelto
		double cuadrado = doble * doble;

		// Trabajar con valores nulos
		Double nuloDoble = null;

		

		
		// Igualación de variables de Integer
		// Crear un array de objetos Integer
        Integer[] array1 = new Integer[]{1, 2, 3, 4, 5};

        // Igualar el segundo array al primero
        Integer[] array2 = array1;

        // Modificar el segundo array
        array2[0] = 10;

        // Mostrar el contenido de ambos arrays
        System.out.println("Contenido del primer array:");
        for (Integer num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Contenido del segundo array:");
        for (Integer num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
		
		
		// Igualación de variables de tipo Integer
		Integer valor1=Integer.valueOf(3);
		Integer valor2=Integer.valueOf(5);
		valor2=valor1;
		valor2=Integer.valueOf(0);
		valor1=Integer.valueOf(100);
		System.out.println("valor1:"+valor1);
		System.out.println("valor2:"+valor2);
		
		// Autoboxing: conversión automática de int a Integer
		Integer entero2 = 42;

		// Unboxing: conversión automática de Integer a int
		int valorPrimitivoInteger = entero2;
		
	}

}
