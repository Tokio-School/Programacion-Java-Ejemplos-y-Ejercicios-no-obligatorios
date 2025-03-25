package ejem02_string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AplicacionScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		teclado.useDelimiter(Pattern.compile(","));
		while (teclado.hasNext()) {
			System.out.println(teclado.next());
		}
		
	}

}
