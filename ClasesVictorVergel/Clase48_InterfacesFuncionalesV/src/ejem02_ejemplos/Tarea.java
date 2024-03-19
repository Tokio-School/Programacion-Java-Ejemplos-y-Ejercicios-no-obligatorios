package ejem02_ejemplos;
import java.util.Date;

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
public class Tarea {
    private String descripcion;
    private int prioridad;
    private Date fechaLimite;
}
