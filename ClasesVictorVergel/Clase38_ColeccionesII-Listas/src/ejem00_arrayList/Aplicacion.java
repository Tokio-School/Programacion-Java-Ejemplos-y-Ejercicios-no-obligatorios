package ejem00_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // Crear algunos clientes y empleados
        Cliente cliente1 = new Cliente("Cliente1", listaPedidos);
        Cliente cliente2 = new Cliente("Cliente2", listaPedidos);
        Cliente cliente3 = new Cliente("Cliente3", listaPedidos);
        Empleado empleado1 = new Empleado(listaPedidos,"Empleado1");
        Empleado empleado2 = new Empleado(listaPedidos,"Empleado2");
        
        Pedido p1=new Pedido("Sopa","Victor");
        Pedido p2=new Pedido("Arroz","Juan");
        Pedido p3=new Pedido("Macarrones","Maria");
        listaPedidos.add(p1);
        listaPedidos.add(p2);
        listaPedidos.add(p3);
        
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
        empleado1.start();
        empleado2.start();
        
        

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
        //Collections.sort(listaPedidos);
        
        
        

	}

}
