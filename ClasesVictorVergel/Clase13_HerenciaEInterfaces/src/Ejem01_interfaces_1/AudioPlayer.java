package Ejem01_interfaces_1;

public class AudioPlayer implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Soy el play del Audioplayer");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Soy el pause del Audioplayer");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Soy el stop del Audioplayer");
	}

}
