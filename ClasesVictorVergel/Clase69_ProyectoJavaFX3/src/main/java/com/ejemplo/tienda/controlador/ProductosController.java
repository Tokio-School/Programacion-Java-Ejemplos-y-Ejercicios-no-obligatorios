package com.ejemplo.tienda.controlador;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.ejemplo.tienda.modelo.Producto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.binding.Bindings;

public class ProductosController implements Initializable {

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
    

    private IntegerProperty daysLeftProperty = new SimpleIntegerProperty();
    
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		datePickerExpiry.setValue(LocalDate.now());

        // Vincula el cambio en la fecha de caducidad para actualizar los días restantes
        datePickerExpiry.valueProperty().addListener((obs, oldValue, newValue) -> updateDaysLeft(newValue));

        // Vincula el texto del label al property daysLeftProperty
        labelDaysLeft.textProperty().bind(Bindings.concat("Días restantes: ", daysLeftProperty.asString()));
	}

	private void updateDaysLeft(LocalDate expiryDate) {
        if (expiryDate != null) {
            LocalDate today = LocalDate.now();
            daysLeftProperty.set((int) (expiryDate.toEpochDay() - today.toEpochDay()));
        } else {
            daysLeftProperty.set(0);
        }
    }

}
