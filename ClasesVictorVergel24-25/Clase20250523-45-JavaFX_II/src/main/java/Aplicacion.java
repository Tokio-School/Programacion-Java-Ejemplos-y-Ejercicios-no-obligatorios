import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(Aplicacion.class.getResource("Vista.fxml"));
		Parent root=null;
		try {
			root=loader.load();
		} catch (IOException e) {	e.printStackTrace();}
		Scene scene = new Scene(root, 900, 750);
		
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
