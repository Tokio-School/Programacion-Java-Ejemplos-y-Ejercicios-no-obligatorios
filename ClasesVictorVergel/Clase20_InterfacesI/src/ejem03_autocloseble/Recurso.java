package ejem03_autocloseble;

public class Recurso implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Tranquilo, java sabe mucho, y sí se cierra sólo");
	}

}
