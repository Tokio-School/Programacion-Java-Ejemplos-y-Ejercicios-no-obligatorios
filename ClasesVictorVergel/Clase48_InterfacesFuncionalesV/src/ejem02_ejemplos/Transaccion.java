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
public class Transaccion {
    private int id;
    private TipoTransaccion tipo;
    private double cantidad;
    
    public enum TipoTransaccion {
        INGRESO,
        GASTO
    }
}

