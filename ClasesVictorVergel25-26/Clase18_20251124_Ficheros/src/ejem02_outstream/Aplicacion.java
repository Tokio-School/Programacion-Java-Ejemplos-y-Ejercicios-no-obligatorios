package ejem02_outstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Aplicacion {

	public static void main(String[] args) {
		try (FileOutputStream fos=new FileOutputStream("datos.txt");){
			fos.write(65);
			byte holaMundo[]= {72,111,108,97,32,77,117,110,100,111,33};
			fos.write(holaMundo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		try (FileInputStream fichero=new FileInputStream("datos.txt");){
			
			while(fichero.available()>0) {
				int byteLeido=fichero.read();
				System.out.print((char)byteLeido);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
