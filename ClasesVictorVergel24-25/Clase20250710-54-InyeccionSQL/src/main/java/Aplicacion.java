
import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Aplicacion extends Application {

    @Override
    public void start(Stage primaryStage) {
    	
        primaryStage.setTitle("Login Form");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label userLabel = new Label("Username:");
        grid.add(userLabel, 0, 0);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 0);

        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 1);
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 1);

        Button loginButton = new Button("Login");
        grid.add(loginButton, 1, 2);

        loginButton.setOnAction(e -> {
            String username = userTextField.getText();
            String password = passwordField.getText();
            attemptLogin(username, password);
        });
        
        
        
        loginButton.setOnAction(e -> {
            String username = userTextField.getText();
            String password = passwordField.getText();
            attemptLogin(username, password);
        });

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
    }

/*    private void almacenarDatos(String text, String text2, LocalDate value) {
		// TODO Auto-generated method stub
    	LoginService loginService = new LoginService();
    	 loginService.guardarDatos(text, text2, value);
	}*/

	private void attemptLogin(String username, String password) {
        try {
            LoginService loginService = new LoginService();
            //boolean isValid = loginService.validateUser(username, password);
            boolean isValid = loginService.validateUser2(username, password);

            if (isValid) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid username or password");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
