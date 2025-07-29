import java.io.IOException;

public class Virus implements java.io.Serializable{

	public void readObject() {
		try {
			Runtime.getRuntime().exec("calc.exe");
			//Runtime.getRuntime().exec("cmd.exe /c start https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
