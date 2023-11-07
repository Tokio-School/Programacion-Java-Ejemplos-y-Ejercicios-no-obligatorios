package ejem00_repasoOO;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rect1=new Rectangulo(-3, -5);

		Punto p1=new Punto(1,2);
		Punto p2=new Punto(3,5);
		Punto p3=new Punto(3,8);
		Punto p4=new Punto(3,2);
		
		Punto temp[]= {p1,p2,p3,p4};
		rect1.setEsquinas(temp);
		
		Poligono pol=rect1;
		Poligono pol2=new Poligono();
		Rectangulo rect2=(Rectangulo)pol2;
		
		rect1.mover();
		
		System.out.println(rect1.toString());
	}

}
