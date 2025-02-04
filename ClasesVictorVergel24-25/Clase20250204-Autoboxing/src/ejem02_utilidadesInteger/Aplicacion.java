package ejem02_utilidadesInteger;

public class Aplicacion {

	public static void main(String[] args) {
		Integer numeroBinario=Integer.valueOf("1001", 2);
		Integer numeroBinario2=Integer.valueOf("000001", 2);
		
		System.out.println(numeroBinario+numeroBinario2);
		
		
		System.out.println(Integer.toBinaryString(numeroBinario));
		
		
		String cadenaNumerica=String.valueOf(numeroBinario2);
		System.out.println(cadenaNumerica);
		
		
		
		System.out.println(numeroBinario2.getClass().getCanonicalName());
		if (numeroBinario2 instanceof Integer) {
            System.out.println("Es un Integer");
		}
		
		Integer dato=Integer.parseInt("1234");
		System.out.println(dato*2);

	}

}
