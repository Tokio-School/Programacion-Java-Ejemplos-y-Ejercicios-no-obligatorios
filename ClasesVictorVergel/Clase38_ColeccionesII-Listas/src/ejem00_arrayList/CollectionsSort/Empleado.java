package ejem00_arrayList.CollectionsSort;

import java.util.ArrayList;

public class Empleado extends Thread{

    private ArrayList<Pedido> listaPedidos;
    

    public Empleado(ArrayList<Pedido> listaPedidos,String nombre) {
    	super(nombre);
        this.listaPedidos = listaPedidos;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		while(!(listaPedidos.size()==0))
		{
			Pedido temp=listaPedidos.remove(0);
			System.out.print(getName()+" - "+temp.procesar());
			;
		}
		
	}
    
    
    
}
