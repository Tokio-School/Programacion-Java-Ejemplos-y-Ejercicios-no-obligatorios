package ejem00_autoclosable;

public class Resource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Recurso liberado");
	}

}
