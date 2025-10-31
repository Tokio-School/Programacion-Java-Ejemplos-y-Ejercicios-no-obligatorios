package clases_internas;

import clases_internas.Cuerpo.Corazon;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuerpo cuerpo = new Cuerpo("Cuerpo Humano", 206, 72);
		Cuerpo cuerpo2 = new Cuerpo("Cuerpo Robotico", 150);
		Corazon corazonCuerpo2 = cuerpo2.new Corazon(60);
		System.out.println(cuerpo2);
		cuerpo2.setCorazon(corazonCuerpo2);
		System.out.println(cuerpo2);
	}

}
