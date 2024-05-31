package com.ejemplo.tienda.controlador;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Controller {
    static protected void loadView(String fxmlPath, String title, ActionEvent event) {
        try {
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            Parent root = FXMLLoader.load(Controller.class.getResource(fxmlPath));
            stage.setTitle(title);
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static protected void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.getDialogPane().getStylesheets().add(Controller.class.getResource("/css/styles.css").toExternalForm());
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
