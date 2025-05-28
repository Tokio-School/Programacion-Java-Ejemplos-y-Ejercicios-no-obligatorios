import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controlador implements Initializable {


    @FXML
    void onActionCerrar(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void onActionSaludar(ActionEvent event) {
    	System.out.println("Hola Mundo desde el menú!");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	

    @FXML
    private TextField textFieldDato;


    @FXML
    void onDragDetectedDato(MouseEvent event) {
    	System.out.println("Drag Detected en el TextField: " + textFieldDato.getText());

    }


}