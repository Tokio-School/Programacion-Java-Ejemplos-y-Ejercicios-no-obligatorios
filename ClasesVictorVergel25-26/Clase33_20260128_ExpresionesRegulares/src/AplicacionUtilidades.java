
public class AplicacionUtilidades {

	public static void main(String[] args) {
		String texto="Juan,Perez,30,Madrid;Ana,Gomez,25,Barcelona;Luis,Lopez,28,Valencia";
		String[] registros=texto.split(";");
		for (String registro : registros) {
			String[] campos=registro.split(",");
			System.out.println("Nombre: "+campos[0]);
			System.out.println("Apellido: "+campos[1]);
			System.out.println("Edad: "+campos[2]);
			System.out.println("Ciudad: "+campos[3]);
			System.out.println("---------------------");
		}
		String textoConEspaciosEnBlanco="  Hola   Mundo  ";
		String textoSinEspaciosEnBlanco=textoConEspaciosEnBlanco.replaceAll("\\s+","");
		System.out.println("Texto sin espacios en blanco: '"+textoSinEspaciosEnBlanco+"'");
		
		//textoConEspaciosEnBlanco=textoConEspaciosEnBlanco.replaceAll("[aeiou]", "_");
		textoConEspaciosEnBlanco=textoConEspaciosEnBlanco.replaceFirst("[aeiou]", "*");
		System.out.println("Texto con letras a-o reemplazadas: '"+textoConEspaciosEnBlanco+"'");
		
		

	}

}
