package ejem00_arrayList.CollectionsSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Pedido2> listaPedidos = new ArrayList<>();

        // Crear algunos clientes y empleados
        /*Cliente cliente1 = new Cliente("Cliente1", listaPedidos);
        Cliente cliente2 = new Cliente("Cliente2", listaPedidos);
        Cliente cliente3 = new Cliente("Cliente3", listaPedidos);
        Empleado empleado1 = new Empleado(listaPedidos,"Empleado1");
        Empleado empleado2 = new Empleado(listaPedidos,"Empleado2");*/
        
        Pedido2 p1=new Pedido2("Sopa","Victor");
        Pedido2 p2=new Pedido2("Arroz","Juan");
        Pedido2 p3=new Pedido2("Macarrones","Maria");
        listaPedidos.add(p1);
        listaPedidos.add(p2);
        listaPedidos.add(p3);
        

        
        

        /*
        System.out.println(Arrays.toString(listaPedidos.toArray()));
        
        p1.setCliente("Victor2");
        System.out.println(p1.toString());
        
        System.out.println("Antes del shufle:"+Arrays.toString(listaPedidos.toArray()));
        
       /* System.out.println("Mostrando cada componente individualmente:");
        //int tamano=listaPedidos.size();
        for (int i = 0; i <listaPedidos.size();i++) {
			System.out.println(listaPedidos.remove(0));
		}
        if (listaPedidos.size()==0)
        	System.out.println("No hay pedidos");
        else 
        	System.out.println("Todavía hay pedidos");
        
        System.out.println("---"+Arrays.toString(listaPedidos.toArray())); */  
        /*
        Collections.shuffle(listaPedidos);
        
        System.out.println("Despues del shufle:"+Arrays.toString(listaPedidos.toArray()));
        */
        System.out.println("Antes de ordenar:"+Arrays.toString(listaPedidos.toArray()));
        Collections.sort(listaPedidos, new Comparator<Pedido2>() {

			@Override
			public int compare(Pedido2 p1, Pedido2 p2) {
				// TODO Auto-generated method stub
				return p1.getDescripcion().compareTo(p2.getDescripcion());
			}
		});
        System.out.println("Despues de ordenar:"+Arrays.toString(listaPedidos.toArray()));
        
        
        

	}

}
