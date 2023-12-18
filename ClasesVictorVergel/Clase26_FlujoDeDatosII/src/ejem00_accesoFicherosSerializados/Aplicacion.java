package ejem00_accesoFicherosSerializados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ficheroDatos=new File("datos.txt");
		
		int datos[]= {0,3,5,10,56};
		Dato datos2[]=new Dato[5];
		datos2[0]=new Dato(0);
		datos2[1]=new Dato(3);
		datos2[2]=new Dato(5);
		datos2[3]=new Dato(10);
		
		
		ArrayList<Integer> datos3=new ArrayList<Integer>();
		datos3.add(3);
		datos3.add(333);
		datos3.add(36);
		datos3.add(39);
		
				
		
		System.out.println("Volcando a fichero de texto… ");
		
	   
		//try (BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(ficheroDatos));){
		try (ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream(ficheroDatos));){
			Integer numero=3;
			
			
		    /*ficheroSalida.writeInt(4);
		    ficheroSalida.writeInt(numero);*/
			/*for (int i = 0; i < datos2.length; i++) {
				ficheroSalida.writeObject(datos2[i]);
			}*/
			ficheroSalida.writeObject(datos3);
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//try (BufferedReader ficheroEntrada=new BufferedReader(new FileReader(ficheroDatos));) {
		try (ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(ficheroDatos));){
			
			/*System.out.println(ficheroEntrada.readInt());
			System.out.println(ficheroEntrada.readInt());*/
			/*for (int i = 0; i < datos2.length; i++) {
				try {
					System.out.println(ficheroEntrada.readObject());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			try {
				System.out.println(((ArrayList<Integer>)ficheroEntrada.readObject()).toString());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/*String linea="";
			while((linea=ficheroEntrada.readLine())!=null)
			{
				System.out.println(linea);
			}*/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}

class Dato implements Serializable
{
	public int dato;

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Dato() {
		super();
		this.dato = 0;
	}
	
	public Dato(int dato) {
		super();
		this.dato = dato;
	}

	@Override
	public String toString() {
		return "Dato [dato=" + dato + "]";
	}
	
}

