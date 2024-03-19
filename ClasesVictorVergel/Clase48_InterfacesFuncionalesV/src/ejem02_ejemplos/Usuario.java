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
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
}
