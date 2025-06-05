import java.io.IOException;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BienvenidaController {

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblUsuario;

    @FXML
    void cerrarSesion(MouseEvent event) {

    	
    	
    	
    	FXMLLoader loader = new FXMLLoader(Aplicacion.class.getResource("Login.fxml"));
		Parent root=null;
		try {
			root=loader.load();
		} catch (IOException e) {	e.printStackTrace();}
		
		Stage stage= new Stage();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Login");
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		
		
		ChoiceDialog<String> dialog = new ChoiceDialog<String>("Aceptar", "Cancelar");
		dialog.setTitle("Cerrar sesión");
		dialog.setHeaderText("¿Está seguro de que desea cerrar sesión?");
		Optional<String> respuesta=dialog.showAndWait();
		if (respuesta.isPresent())
		{
			System.out.println("Respuesta: " + respuesta.get());
			if (respuesta.get().equals("Aceptar")) {
				System.out.println("Aceptó");
				stage.show();
				
				Stage primaryStage = (Stage) lblUsuario.getScene().getWindow();
				primaryStage.close(); // Cierra la ventana de login
			}
			else if (respuesta.get().equals("Cancelar")) {
				System.out.println("Canceló");
			}
		}
		else
			System.out.println("No se seleccionó ninguna opción.");
		
		
		
		
		
		
    	
    	
    	
    }

	public void setUsuario(String text, String text2) {
		// TODO Auto-generated method stub
		lblUsuario.setText(text);
		lblPassword.setText(text2);
	}
    
    
    
}
