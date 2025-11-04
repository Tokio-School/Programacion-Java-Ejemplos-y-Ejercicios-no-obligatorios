import paqueteB.ClaseB;
import paqueteB.OtraClaseB;
import paqueteB.PadreB;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseB objB = new ClaseB();
		objB.setAtributoPrivado("Nuevo Valor");
		
		OtraClaseB objOtraB = new OtraClaseB();
		
		
		PadreB objPadreB ;
		objPadreB=objB;
		System.out.println(objPadreB);
		objPadreB=objOtraB;
		System.out.println(objOtraB);
		
		
		
	}
}
