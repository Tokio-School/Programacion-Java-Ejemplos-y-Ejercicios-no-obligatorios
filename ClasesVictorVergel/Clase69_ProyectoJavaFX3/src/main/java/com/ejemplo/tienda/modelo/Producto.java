package com.ejemplo.tienda.modelo;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.ObjectProperty;

import java.io.File;
import java.time.LocalDate;

// TODO: Auto-generated Javadoc
/**
 * The Class Producto.
 */
public class Producto {

    /** The nombre. */
    private final StringProperty nombre;
    
    /** The precio. */
    private final StringProperty precio;
    
    /** The foto. */
    private final ObjectProperty<File> foto;
    
    /** The fecha caducidad. */
    private final StringProperty fechaCaducidad;
    
    
    /**
     * Instantiates a new producto.
     *
     * @param nombre the nombre
     * @param precio the precio
     * @param foto the foto
     * @param fechaCaducidad the fecha caducidad
     */
    public Producto(String nombre, String precio, File foto, LocalDate fechaCaducidad) {
        this.nombre = new SimpleStringProperty(nombre);
        this.precio = new SimpleStringProperty(precio);
        this.foto = new SimpleObjectProperty<>(foto);
        this.fechaCaducidad = new SimpleStringProperty(fechaCaducidad.toString());
    }

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre.get();
    }

   /* public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }*/

    /**
    * Nombre property.
    *
    * @return the string property
    */
   public StringProperty nombreProperty() {
        return nombre;
    }

   /**
   * Nombre property.
   *
   * @return the string property
   */
  public StringProperty fechaCaducidadProperty() {
       return fechaCaducidad;
   }
   
   
    /**
     * Gets the precio.
     *
     * @return the precio
     */
    public String getPrecio() {
        return precio.get();
    }

    /*public void setPrecio(String precio) {
        this.precio.set(precio);
    }*/

    /**
     * Precio property.
     *
     * @return the string property
     */
    public StringProperty precioProperty() {
        return precio;
    }

    /**
     * Gets the foto.
     *
     * @return the foto
     */
    public File getFoto() {
        return foto.get();
    }

    /*public void setFoto(File foto) {
        this.foto.set(foto);
    }*/

    /**
     * Foto property.
     *
     * @return the object property
     */
    public ObjectProperty<File> fotoProperty() {
        return foto;
    }



	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", foto=" + foto + ", fechaCaducidad="
				+ fechaCaducidad + "]";
	}

	/**
	 * Gets the fecha caducidad.
	 *
	 * @return the fecha caducidad
	 */
	public StringProperty getFechaCaducidad() {
		return fechaCaducidad;
	}
	
	


}
