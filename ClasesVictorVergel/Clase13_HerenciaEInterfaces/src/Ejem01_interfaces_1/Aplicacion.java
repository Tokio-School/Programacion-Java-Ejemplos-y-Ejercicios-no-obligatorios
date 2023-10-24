package Ejem01_interfaces_1;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer casete80=new AudioPlayer();
		casete80.play();
		casete80.stop();
		
		VideoPlayer reproductorMovil=new VideoPlayer();
		reproductorMovil.play();
		reproductorMovil.stop();
	}

}
