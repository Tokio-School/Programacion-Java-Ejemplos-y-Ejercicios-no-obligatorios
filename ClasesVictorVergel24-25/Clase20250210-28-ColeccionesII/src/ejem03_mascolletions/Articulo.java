package ejem03_mascolletions;

public class Articulo implements Comparable<Articulo>{
	
	
	
		private String nombre;
		private double precio;
		
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		/**
		 * @param nombre
		 * @param precio
		 */
		public Articulo(String nombre, double precio) {
			super();
			this.nombre = nombre;
			this.precio = precio;
		}
		/**
		 * 
		 */
		public Articulo() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Articulo [nombre=" + nombre + ", precio=" + precio + "]";
		}
		/*@Override
		public int compareTo(Articulo otroArticulo) {
			// TODO Auto-generated method stub
			if (this.nombre.compareTo(otroArticulo.getNombre()) > 0)
				return 1;
			else if (this.nombre.compareTo(otroArticulo.getNombre()) < 0)
                return -1;
            else
            	return 0;
		}*/
		
		public int compareTo(Articulo otroArticulo) {
			// TODO Auto-generated method stub
			if (this.precio > otroArticulo.getPrecio())
				return 1;
			else if (this.precio< otroArticulo.getPrecio())
                return -1;
            else
            	return 0;
		}
		@Override
		public boolean equals(Object obj) {
			if (nombre.equals(((Articulo) obj).getNombre()) && precio == ((Articulo) obj).getPrecio())
				return true;
			else
				return false;
		}
		
		
		
		

}
