package Ejem01_interfaces_1;

public class VideoPlayer implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Soy el play del VideoPlayer");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Soy el pause del VideoPlayer");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Soy el stop del VideoPlayer");
	}

}
