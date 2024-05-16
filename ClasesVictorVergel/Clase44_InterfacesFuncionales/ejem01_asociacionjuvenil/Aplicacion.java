package ejem01_asociacionjuvenil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson=new Gson();
		//FileReader reader=null;
		ArrayList<AsociacionJuvenil> lista=null;
		try (FileReader fichero = new FileReader("asociaciones-juveniles.json");){
			
			Type tipo_lista=new TypeToken<List<AsociacionJuvenil>>(){}.getType();
			lista=gson.fromJson(fichero, tipo_lista);
			for (AsociacionJuvenil persona : lista) {
				System.out.println(persona);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		
		try (FileReader fichero = new FileReader("personas2.json");){
			
			Type tipo_lista=new TypeToken<HashMap<String,AsociacionJuvenil>>(){}.getType();
			HashMap<String,AsociacionJuvenil> mapaPersonas=gson.fromJson(fichero, tipo_lista);
			
			for (Map.Entry<String, AsociacionJuvenil> entry : mapaPersonas.entrySet()) {
				System.out.println(entry.getKey()+" --- "+entry.getValue().getCodigo()+ " --- "+entry.getValue().getDenominacionDeEntidad());
			}
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		
		TreeSet<AsociacionJuvenil> listaOrdenada=new TreeSet<AsociacionJuvenil>(new Comparator<AsociacionJuvenil> () {

			@Override
			public int compare(AsociacionJuvenil o1, AsociacionJuvenil o2) {
				// TODO Auto-generated method stub
				return o1.getCodigo().compareTo(o2.getCodigo());
			}}
		);

				
		listaOrdenada.addAll(lista);
	/*	listaOrdenada.add(new AsociacionJuvenil("Victor",18));
		listaOrdenada.add(new AsociacionJuvenil("Victor",18));*/
		System.out.println(listaOrdenada);
				
				
				
		
		
	}

}
