package ejem02_ejemplos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@ToString
public class PuntoDeInteres {
    private String nombre;
    private double latitud;
    private double longitud;
    private String categoria;
    
}

