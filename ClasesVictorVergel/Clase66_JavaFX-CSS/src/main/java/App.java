
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		// UTF-8 en la consola
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("App.fxml"));
		Parent root=null;
		try {
			root= loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //Recorro todos los componentes del root. Los botones no están en el VBox.
		// no puedo hacerlo desde CSS. Aunque en el componente padre que lo contiene puedes meterle 
		// la propiedad spacing que le da ese espaciado entre los botones que lo contenga.
			for (int i = 0; i < ((VBox) root).getChildren().size(); i++) {
				VBox.setMargin(((VBox) root).getChildren().get(i), new Insets(5));
			}
		VBox.setMargin(root, new Insets(15));
		Scene scene = new Scene(root, 900, 750);
		scene.getStylesheets().add(getClass().getResource("App.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
