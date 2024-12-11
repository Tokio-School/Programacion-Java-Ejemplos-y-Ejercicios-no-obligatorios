package ejem01_excepcionesbasicas;

public class MiRecurso implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cerrando el recurso");
		throw new Exception("Error al cerrar el recurso");
		//System.gc();
	}

}
