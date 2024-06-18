package com.example;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorMessage;

    private ObservableList<Usuario> usuarios = FXCollections.observableArrayList(
        new Usuario("user1", "password123"),
        new Usuario("user2", "password456")
    );

    private Alert lastAlert;

    @FXML
    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (isValidInput(username, password)) {
            for (Usuario usuario : usuarios) {
                if (usuario.getNombre().equals(username) && usuario.getPassword().equals(password)) {
                    showAlert("Login Successful", "Gracias " + username);
                    return;
                }
            }
            errorMessage.setText("Usuario no encontrado");
        } else {
            errorMessage.setText("Entrada no válida");
        }
    }

    private boolean isValidInput(String username, String password) {
        return Pattern.matches("^[a-zA-Z0-9]+$", username) && password.length() > 5;
    }

    private void showAlert(String title, String message) {
        lastAlert = new Alert(Alert.AlertType.INFORMATION);
        lastAlert.setTitle(title);
        lastAlert.setHeaderText(null);
        lastAlert.setContentText(message);
        lastAlert.showAndWait();
    }

    public Alert getLastAlert() {
        return lastAlert;
    }
}
