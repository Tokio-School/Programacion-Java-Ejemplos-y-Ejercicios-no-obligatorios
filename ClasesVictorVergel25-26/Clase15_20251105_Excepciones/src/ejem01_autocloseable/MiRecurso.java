package ejem01_autocloseable;

public class MiRecurso implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Cerrando MiRecurso");
	}
	
}
