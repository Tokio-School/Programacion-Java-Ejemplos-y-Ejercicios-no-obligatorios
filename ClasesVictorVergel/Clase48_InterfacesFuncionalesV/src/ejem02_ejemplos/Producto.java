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
public class Producto {
    private String nombre;
    private double precio;
    private double descuento;
    private int cantidad;
}
