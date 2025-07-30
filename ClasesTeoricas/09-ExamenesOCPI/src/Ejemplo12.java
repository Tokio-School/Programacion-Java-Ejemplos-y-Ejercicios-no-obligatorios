
public class Ejemplo12 {

	 public static void main(String[] args) {
	        final StringBuilder sb = new StringBuilder("Hello");
	        //sb=new StringBuilder("Hola"); 
	        sb.append(" World");
	        System.out.println(sb);
	    }
	}
/**
Opciones:
A) Error por modificar una variable final.
B) Se imprime Hello.
C) Se imprime Hello World.
D) El código no compila.
*/