package tokioschool.com;

import java.io.File;
import java.net.URL;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		
		CursoProgramacion curso=new CursoProgramacion();
		curso.setNombreCurso("java");
		curso.setNombreProfesor("Victor");
		CursoProgramacion curso2=new CursoProgramacion("kotlin", "Pedro Duque", 100);
		
		System.out.println(curso);
		System.out.println(curso2);
		
		
		// Recuperar el fichero de los recursos.
		String nombreFichero="info.txt";
		URL ficheroDatos=Aplicacion.class.getClassLoader().getResource(nombreFichero);
		File ficheroFisico= new File(ficheroDatos.getFile());
		System.out.println(ficheroFisico.getAbsolutePath());
		
		
		
		
		
	}

}
