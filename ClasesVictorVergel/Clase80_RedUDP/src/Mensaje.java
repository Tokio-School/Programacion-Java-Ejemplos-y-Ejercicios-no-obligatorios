

//Mensaje.java
import java.io.Serializable;

public class Mensaje implements Serializable {
 private static final long serialVersionUID = 1L;
 private String contenido;
 
 public Mensaje(String contenido) {
     this.contenido = contenido;
 }
 
 public String getContenido() {
     return contenido;
 }
 
 public void setContenido(String contenido) {
     this.contenido = contenido;
 }
}
