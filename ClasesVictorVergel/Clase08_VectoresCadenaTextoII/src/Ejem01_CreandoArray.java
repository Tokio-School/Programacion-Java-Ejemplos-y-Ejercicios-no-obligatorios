import java.util.Scanner;

public class Ejem01_CreandoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombresCiudades={"Valladolid","Burgos","Salamanca"};
		for (String ciudad : nombresCiudades) {
			System.out.println(ciudad);
		}
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introzca el número de alumnos:");
		int numAlumnos=teclado.nextInt();	
		int [] edadesCurso=new int[numAlumnos];
		for (int i = 0; i < edadesCurso.length; i++) {
			edadesCurso[i]=teclado.nextInt();
		}
		
		System.out.println("Edad media:"+mediaCurso(edadesCurso));
		
		teclado.close();
		
	}

	private static int mediaCurso(int[] edadesCurso) {
		// TODO Auto-generated method stub
		int edadTotal=0;
		for (int i = 0; i < edadesCurso.length; i++) {
			edadTotal=edadTotal+edadesCurso[i];
		}
		
		
		return edadTotal/edadesCurso.length;
	}



}
