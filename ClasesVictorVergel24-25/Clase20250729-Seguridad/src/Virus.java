import java.io.IOException;
import java.io.ObjectInputStream;

public class Virus implements java.io.Serializable{

	private void readObject(ObjectInputStream ois) {
		try {
			System.out.println("Soy un virus y estoy infectando tu sistema");
			Runtime.getRuntime().exec("calc.exe");
			System.out.println("Fin infeccion");
			//Runtime.getRuntime().exec("cmd.exe /c start https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
