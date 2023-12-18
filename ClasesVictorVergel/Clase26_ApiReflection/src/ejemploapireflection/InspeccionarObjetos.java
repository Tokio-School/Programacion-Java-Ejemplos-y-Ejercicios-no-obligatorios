package ejemploapireflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


import com.example.Dato2;


public class InspeccionarObjetos {

	public static void listadoAtributosYMetodos(Object objeto) {
		Class<?> claseObjeto=objeto.getClass();
		
		System.out.println("Atributos del objeto:");
		//Atributos del objeto
		for (Field atributo : claseObjeto.getDeclaredFields()) {
			System.out.println(atributo.getName());
		}
		System.out.println("Métodos del objeto:");
		//Metodos del objeto
		for (Method metodos : claseObjeto.getMethods()) {
			System.out.println(metodos.getName());
		}
		
		System.out.println("Llamando al toString del objeto:");
		try {
			Method metodoToString=claseObjeto.getDeclaredMethod("toString");
			//metodoToString.setAccessible(true);
			String resultado=(String) metodoToString.invoke(objeto);
			System.out.println(resultado);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// Llamando al Constructor de la Clase.
		try {
			Constructor<?> constructor=claseObjeto.getConstructor(int.class);
			Object nuevoObjeto=constructor.newInstance(4);
			System.out.println(nuevoObjeto.toString());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InspeccionarObjetos io=new InspeccionarObjetos();
		//Dato dato=io.new Dato(43);
		
		InspeccionarObjetos.listadoAtributosYMetodos(new Dato(43));
		
		
		InspeccionarObjetos.listadoAtributosYMetodos(new Dato2(43));
	}
	
	
	

}

class Dato
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


