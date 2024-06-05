package com.ejemplo.tienda.controlador;

import com.ejemplo.tienda.modelo.UserDatabase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void handleCancelAction(ActionEvent event) {

    }

    @FXML
    void handleRegisterAction(ActionEvent event) {
    	Controller.showAlert("Registro", "Usuario registrado correctamente");
    	Controller.loadView("/fxml/login.fxml", "Login", event);
    	UserDatabase.addUser(usernameField.getText(), passwordField.getText());
    	
    }

}
