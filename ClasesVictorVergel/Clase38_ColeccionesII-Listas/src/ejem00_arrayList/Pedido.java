package ejem00_arrayList;

class Pedido {
    private String descripcion;
    private String cliente;

    public Pedido(String descripcion, String cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public String procesar() {
        return "Pedido de " + cliente + ": " + descripcion + " procesado.";
    }

	@Override
	public String toString() {
		return "Pedido [descripcion=" + descripcion + ", cliente=" + cliente + "]";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



}    