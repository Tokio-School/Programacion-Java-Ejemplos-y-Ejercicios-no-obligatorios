package com.ejemplo.tienda.controlador;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> priceColumn;

    @FXML
    private ImageView productImageView;

    @FXML
    private TableView<?> productTableView;

    @FXML
    void handleAddProductAction(ActionEvent event) {
        try {
        	Stage primaryStage = (Stage) ((Node) productTableView).getScene().getWindow();
            Parent root = FXMLLoader.load(Controller.class.getResource("/fxml/add_product.fxml"));
            primaryStage.setTitle("Añadir producto");
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleSalir(ActionEvent event) {
    	
    }

    @FXML
    void handleVolverAlLogin(ActionEvent event) {

    }

}
