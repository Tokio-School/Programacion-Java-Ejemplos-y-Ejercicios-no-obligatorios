/**
 * 
 */

/**
 * 
 */
public class Aplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Posicion punto1 = new Posicion(0,0);
		Posicion punto2 = new Posicion(1,1);
		punto1.setX(10);
		System.out.println("La posición x del punto 1 es:"+punto1.getX());
		
		punto1.mover(10);

		System.out.println(punto1.toString());
		
		
		
		Rectangulo r = new Rectangulo(punto1, punto2);
		System.out.println(r.superficie());
		System.out.println("Lados del rectánguo:"+r.getLados());
		
		
		
		Calculadora	c = new Calculadora();
		Posicion nuevoPunto1=new Posicion(10,10);
		Posicion nuevoPunto2=new Posicion(20,30);
		Posicion resultado = c.sumar(nuevoPunto1, nuevoPunto2);
		System.out.println(resultado.toString());
		
		System.out.println("Los puntos son iguales:"+nuevoPunto1.equals(nuevoPunto2));
		
	}

}
