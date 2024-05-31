package com.ejemplo.tienda.modelo;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.ObjectProperty;

import java.io.File;

public class Producto {

    private final StringProperty nombre;
    private final StringProperty precio;
    private final ObjectProperty<File> foto;

    public Producto(String nombre, String precio, File foto) {
        this.nombre = new SimpleStringProperty(nombre);
        this.precio = new SimpleStringProperty(precio);
        this.foto = new SimpleObjectProperty<>(foto);
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public String getPrecio() {
        return precio.get();
    }

    public void setPrecio(String precio) {
        this.precio.set(precio);
    }

    public StringProperty precioProperty() {
        return precio;
    }

    public File getFoto() {
        return foto.get();
    }

    public void setFoto(File foto) {
        this.foto.set(foto);
    }

    public ObjectProperty<File> fotoProperty() {
        return foto;
    }

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", foto=" + foto + "]";
	}


}
