package parametros_de_entrada;

import java.io.IOException;

public class EjemploEntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			Process process = Runtime.getRuntime().exec("cmd /c dir "+args[0]+" > salida.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir", args[0], ">", "salida.txt");
		try {
			Process process = pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
