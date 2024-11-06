package inyeccion_codigo;

import java.io.IOException;

public class InyeccionCodigo 
{
	 public static void main(String[] args) throws IOException {
	        String dir = args[0];
	        Process process = Runtime.getRuntime().exec("ls " + dir);
	        /* Lo soluciona:
	         * ProcessBuilder processBuilder = new ProcessBuilder("ls", dir);
        		Process process = processBuilder.start();
	         */
	        process.getInputStream().transferTo(System.out);
	    }
}
