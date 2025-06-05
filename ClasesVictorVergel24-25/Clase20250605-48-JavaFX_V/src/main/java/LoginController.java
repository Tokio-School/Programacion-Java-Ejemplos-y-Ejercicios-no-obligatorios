import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsuario;

    @FXML
    void acceder(MouseEvent event) {
    	FXMLLoader loader = new FXMLLoader(Aplicacion.class.getResource("Bienvenida.fxml"));
		Parent root=null;
		try {
			root=loader.load();
		} catch (IOException e) {	e.printStackTrace();}
		
		BienvenidaController bienvenidaController = loader.getController();
		bienvenidaController.setUsuario(txtUsuario.getText(),txtPassword.getText());
		
		Stage stage= new Stage();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Bienvenido");
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		
		
		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
		alerta.setTitle("Acceso concedido");
		alerta.setHeaderText("Bienvenido " + txtUsuario.getText());
		alerta.setContentText("Has accedido correctamente al sistema.");
		alerta.showAndWait();
		
		
		stage.show();
		
		Stage primaryStage = (Stage) txtUsuario.getScene().getWindow();
		primaryStage.close(); // Cierra la ventana de login
		
    }
}
