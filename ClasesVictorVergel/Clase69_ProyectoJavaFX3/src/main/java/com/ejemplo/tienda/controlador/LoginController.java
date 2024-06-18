package com.ejemplo.tienda.controlador;



import com.ejemplo.tienda.modelo.UserDatabase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void handleLoginAction(ActionEvent event) {
		if (UserDatabase.authenticate(usernameField.getText(), passwordField.getText())) {
			Controller.showAlert("Usuario validado", " Bienvenido");
			Controller.loadView("/fxml/main.fxml", "Listado de producto", event);
		} else {
			Controller.showAlert("Error", "Usuario o contraseña incorrectos");
		}
    }

    @FXML
    void handleRegisterAction(ActionEvent event) {
    	Controller.loadView("/fxml/registro.fxml", "Registro Usuario", event);
    }

}
