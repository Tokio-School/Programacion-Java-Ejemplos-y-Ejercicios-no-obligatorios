
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		// UTF-8 en la consola
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("App2.fxml"));
		Parent root=null;
		try {
			root= loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root, 900, 750);
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		launch(args);
	}
}
