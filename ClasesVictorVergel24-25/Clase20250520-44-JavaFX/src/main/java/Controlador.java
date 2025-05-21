import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controlador {

    @FXML
    private Button b_saludar;

    @FXML
    private Label label_holaMundo;
    

    @FXML
    void b_accionSaludar(ActionEvent event) {
        System.out.println("Hola Mundo");
        label_holaMundo.setText("Hola Mundo en ejecución");
    }
}
