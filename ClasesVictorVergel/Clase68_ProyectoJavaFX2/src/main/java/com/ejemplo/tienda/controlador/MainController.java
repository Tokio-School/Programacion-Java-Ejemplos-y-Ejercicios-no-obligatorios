package com.ejemplo.tienda.controlador;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.ejemplo.tienda.modelo.Producto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController implements Initializable {

    @FXML
    private TableColumn<Producto, String> nameColumn;

    @FXML
    private TableColumn<Producto, String> priceColumn;

    @FXML
    private ImageView productImageView;

    @FXML
    private TableView<Producto> productTableView;

    private ObservableList<Producto> productList = FXCollections.observableArrayList();
    
    @FXML
    private TableColumn<Producto, LocalDate> columnaFechaCaducidad;
    
    
    @FXML
    void handleAddProductAction(ActionEvent event) {
    	try {
            // Cargar el FXML de la ventana secundaria
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/add_product.fxml"));
            Scene scene = new Scene(loader.load());

            //Recuperamos la stage actual
            Stage primaryStage = (Stage) ((Node) productTableView).getScene().getWindow();
            
         // Crear un nuevo Stage (ventana)
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);

            // Obtener la ventana principal y establecerla como owner de la nueva ventana
            stage.initOwner(primaryStage);
            stage.setTitle("Inserción datos de producto");

            // Mostrar la ventana y esperar a que se cierre
            stage.showAndWait();


            //Recuperar el controlador de la ventana secundaria
            ProductosController controller = loader.getController();
            
            // Obtener los datos devueltos desde la ventana secundaria
            Producto result = controller.getResult();
        	productList.add(result);
            System.out.println("Resultado devuelto: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleSalir(ActionEvent event) {
    	
    }

    @FXML
    void handleVolverAlLogin(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        priceColumn.setCellValueFactory(cellData -> cellData.getValue().precioProperty());
        columnaFechaCaducidad.setCellValueFactory(new PropertyValueFactory<>("fechaCaducidad"));

        productTableView.setItems(productList);

/*        productTableView.getSelectionModel().selectedItemProperty().addListener(
	                (observable, oldValue, newValue) -> showProductDetails(newValue));
*/

	}

}
