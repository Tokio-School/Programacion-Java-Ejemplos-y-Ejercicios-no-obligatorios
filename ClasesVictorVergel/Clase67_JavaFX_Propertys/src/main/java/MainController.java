import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class MainController implements Initializable {

    @FXML
    private Label labet_texto;

    @FXML
    private TextField text_field_campo;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

        StringProperty textProperty = new SimpleStringProperty();
        textProperty.bindBidirectional(text_field_campo.textProperty());
        labet_texto.textProperty().bind(textProperty);


	}

}
