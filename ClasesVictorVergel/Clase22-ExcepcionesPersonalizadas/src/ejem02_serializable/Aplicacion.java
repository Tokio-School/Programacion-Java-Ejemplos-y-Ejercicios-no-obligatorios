package ejem02_serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacion {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cliente> listado=new ArrayList<Cliente>();
		listado.add(new Cliente("Victor","8383"));
		
		byte[] datosSerializados = serializarLista(listado);
		
		System.out.println(Arrays.toString(datosSerializados));
		
		System.out.println(deserializarLista(datosSerializados));
		
		
	}

	private static byte[] serializarLista(List<Cliente> listado) {
		// TODO Auto-generated method stub
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
	         ObjectOutputStream oos = new ObjectOutputStream(baos)) {

	            // Escribir la lista en el ObjectOutputStream
	            oos.writeObject(listado);

	            // Obtener los datos serializados como un arreglo de bytes
	            return baos.toByteArray();

	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	}
	private static List<Cliente> deserializarLista(byte[] datosSerializados) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(datosSerializados);
             ObjectInputStream ois = new ObjectInputStream(bais)) {

            // Leer la lista desde el ObjectInputStream
            return (List<Cliente>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
	

}
