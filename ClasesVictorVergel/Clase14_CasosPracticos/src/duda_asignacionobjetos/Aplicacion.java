package duda_asignacionobjetos;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poligono pol=new Poligono();
		Cuadrado cua=new Cuadrado();
		Triangulo tri=new Triangulo();
		
		pol=cua;
		((Cuadrado)pol).girarCuadrado();
		
		pol.medotoSobreescrito();
		
		tri.mostrarDatosObjecto();
		cua.mostrarDatosObjecto();
		pol.mostrarDatosObjecto();
		
		
	}

}
