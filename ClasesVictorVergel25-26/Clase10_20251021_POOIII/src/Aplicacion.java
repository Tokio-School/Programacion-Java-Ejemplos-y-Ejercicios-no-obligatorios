
public class Aplicacion {

	public Aplicacion() {
		// TODO Auto-generated method stub
			int numero = 5;
			int numero2 = 5;
			
			if (numero == numero2) {
				System.out.println("Los numeros son iguales");
			} else {
				System.out.println("Los numeros son diferentes");
			}
			
			String texto1 = "Hola";
			String texto2 = "Hola";
			if (texto1.equals(texto2)) {
				System.out.println("-->Los textos son iguales");
			} else {
				System.out.println("-->Los textos son diferentes");
			}
			if (texto1==texto2) {
				System.out.println("-->Los textos son iguales");
			} else {
				System.out.println("-->Los textos son diferentes");
			}
			
			Coche coche1 = new Coche();
			coche1.setMarca("Toyota");
			coche1.setModelo("Corolla");
			coche1.setNumeroRuedas(4);
			coche1.setNumeroBastidor("ABC123");
			
			
			Coche coche2 = new Coche();
			coche2.setMarca("Toyota");
			coche2.setModelo("Corolla");
			coche2.setNumeroRuedas(4);
			coche2.setNumeroBastidor("ABC123");
			
			Coche coche3 = coche1;
			
			if (coche1.equals(coche2)) {
				System.out.println("-----Los coches son iguales");
			} else {
				System.out.println("Los coches son diferentes");
			}
			if (coche1==coche2) {
				System.out.println("Los coches son iguales");
			} else {
				System.out.println("Los coches son diferentes");
			}
			if (coche1==coche3 && coche1.equals(coche3)) {
				System.out.println("Coche1 y Coche3 iguales.Los coches son iguales");
			} else {
				System.out.println("Los coches son diferentes");
			}
			System.out.println(coche1);
			
			
		    coche1.arrancar();
		    coche1.acelerar();
		    
		    Coche coche4 = new Coche();

		    
		    Moto moto1 = new Moto();
		    System.out.println("Numero de ruedas moto: "+moto1.getNumeroRuedas());
	}
	
	
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
	}

}
