import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador implements Initializable {

    @FXML
    private Button button_recuperarDatos;

    @FXML
    private Label label_edad;
    
    @FXML
    private Label label_persona_insertada;

    @FXML
    private Label label_nombre;

    @FXML
    private TextField text_field_nombre;

    @FXML
    private TextField text_filed_edad;

    @FXML
    void onaction_recuperarDatos(ActionEvent event) {
    	
    	Persona p = new Persona(text_field_nombre.getText(), Integer.parseInt(text_filed_edad.getText()));
    	System.out.println("Hola "+p);
    	label_persona_insertada.setText("Hola "+p);
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}