package ejem03_stringBuffer;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		Productor p = new Productor(sb);
		Consumidor c = new Consumidor("C1",sb);
		Consumidor c2 = new Consumidor("C2",sb);
		p.start();
		c.start();
		c2.start();
		
		
		
	}

}
