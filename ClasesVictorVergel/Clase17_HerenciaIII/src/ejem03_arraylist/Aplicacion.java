package ejem03_arraylist;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona padre=new Persona("Jorge", "Rodriguez Diaz", 56);
		Persona madre=new Persona("Luz", "Rodriguez Diaz", 56);
		Persona hijo=new Persona("Jose Manuel", "Rodriguez Diaz", 6);
		Persona hija=new Persona("Maria", "Rodriguez Diaz", 10);
		padre.addFamiliar(madre);
		padre.addFamiliar(hijo);
		padre.addFamiliar(hija);
		
		System.out.println(padre);

	}

}
