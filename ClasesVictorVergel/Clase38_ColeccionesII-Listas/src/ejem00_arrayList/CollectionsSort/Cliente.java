package ejem00_arrayList.CollectionsSort;

import java.util.ArrayList;

public class Cliente extends Thread{

	private ArrayList<Pedido> listaPedidos;
    private String nombreCliente;

    public Cliente(String nombreCliente, ArrayList<Pedido> listaPedidos) {
        this.nombreCliente = nombreCliente;
        this.listaPedidos = listaPedidos;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		
	}
    
    
    
    
    
}
