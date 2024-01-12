package ejem02_iniciandoProductorConsumidor;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadenaCompartida cadena=new CadenaCompartida();
		
		Productor p=new Productor(cadena);
		Consumidor c=new Consumidor(cadena);
		p.start();
		c.start();
		
		
	}

}
