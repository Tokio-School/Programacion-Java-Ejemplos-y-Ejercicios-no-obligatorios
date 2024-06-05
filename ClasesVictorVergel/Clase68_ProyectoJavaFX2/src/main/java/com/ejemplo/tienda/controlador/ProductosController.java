package com.ejemplo.tienda.controlador;

import java.io.File;

import com.ejemplo.tienda.modelo.Producto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProductosController {

    @FXML
    private TextField nameField;

    @FXML
    private ImageView photoPreview;

    @FXML
    private TextField priceField;
    
    
    @FXML
    private DatePicker datePickerExpiry;
    

    @FXML
    private Label labelDaysLeft;
    
    private Producto nuevoProducto;
    
    private File fotoSeleccionada;
    
    
    @FXML
    void handleAddProductAction(ActionEvent event) {
    	String nombre=nameField.getText();
    	String precio=priceField.getText();
    	nuevoProducto=new Producto(nombre,precio,fotoSeleccionada,datePickerExpiry.getValue());
    	System.out.println(nuevoProducto);
    	/*nameField.clear();
    	priceField.clear();
    	photoPreview.setImage(null);*/
    	
    	Stage ventanaProducto=(Stage) nameField.getScene().getWindow();
    	ventanaProducto.close();
    	
    	
    }

    @FXML
    void handleCancelAction(ActionEvent event) {

    }

    @FXML
    void handleSelectPhotoAction(ActionEvent event) {
    	FileChooser fileChooser=new FileChooser();
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("Imagenes","*.jpg","*.png"));
    	fotoSeleccionada=fileChooser.showOpenDialog(null);
		if (fotoSeleccionada != null) {
			photoPreview.setImage(new javafx.scene.image.Image(fotoSeleccionada.toURI().toString()));
		}
    	
    }
    
	public Producto getResult()
	{
		return nuevoProducto;
	}


}
