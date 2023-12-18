package ejem03_accesoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fich_direc=new File("c:\\users");
		if (fich_direc.exists())
		{
			System.out.print("Existe");
			if (fich_direc.isDirectory())
				System.out.print(" la carpeta");
			else
				System.out.print(" el fichero");
		}
		else
			System.out.println("No existe");
		
		
		File listado[]=fich_direc.listFiles();
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i].getName());
		}
		
		File ficheroDatos=new File("datos.txt");
		
		System.out.println("Volcando a fichero de texto… ");
		
	    //BufferedWriter ficheroSalida;
		try (BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(ficheroDatos));){
			
		    ficheroSalida.write("Hola");
		    ficheroSalida.newLine();
		    ficheroSalida.write("Este es");
		    ficheroSalida.write(" un fichero de texto");
		    ficheroSalida.newLine();
		    
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try (BufferedReader ficheroEntrada=new BufferedReader(new FileReader(ficheroDatos));) {
//			
//			String linea="";
//			while((linea=ficheroEntrada.readLine())!=null)
//			{
//				System.out.println(linea);
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try (BufferedReader ficheroEntrada=new BufferedReader(new FileReader("datos.txt"));) {
			
			String linea="";
			while((linea=ficheroEntrada.readLine())!=null)
			{
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
