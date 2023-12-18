package ejem02_tecladoCaracteres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inserte una frase:");
		
		
		String frase=null;
		try (InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader bReader=new BufferedReader(isr);) 
		{
			frase= bReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(frase);
		
		
		

	}

}
