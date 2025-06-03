import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

public class Controlador implements Initializable {

    @FXML
    private ListView<String> listView;

    @FXML
    private TextField textFieldDato;

    @FXML
    private TreeView<String> treeViewDatos;
	

    @FXML
    private TableColumn<Persona, String> colApellido;

    @FXML
    private TableColumn<Persona, String> colNombre;

    @FXML
    private TableView<Persona> table;
    
    
    
	
    @FXML
    void onActionCerrar(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void onActionSaludar(ActionEvent event) {
    	System.out.println("Hola Mundo desde el menú!");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// Inicializamos la Lista
		listView.getItems().addAll("Lunes", "Martes", "Miércoles");

		// Inicializamos el TreeView
		TreeItem<String> root = new TreeItem<>("Animales");
		TreeItem<String> mamiferos = new TreeItem<>("Mamíferos");
		mamiferos.getChildren().addAll(new TreeItem<>("Perro"), new TreeItem<>("Gato"));
		root.getChildren().add(mamiferos);

		treeViewDatos.setRoot(root);

		
		// Inicializamos la Tabla
		colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
		
		ObservableList<Persona> personas = FXCollections.observableArrayList(
				new Persona("Juan", "Pérez"),
				new Persona("Ana", "Gómez"),
				new Persona("Luis", "Martínez")
		);
		
		table.setItems(personas);
		table.getItems().addAll(new Persona("Carlos", "Sánchez"), new Persona("María", "López"));
		
	}
	

    @FXML
    void onDragDetectedDato(MouseEvent event) {
    	System.out.println("Drag Detected en el TextField: " + textFieldDato.getText());
    	String textoSeleccionado=textFieldDato.getSelectedText();
    	
		if (!textoSeleccionado.isEmpty()) {
			Dragboard dragboard = textFieldDato.startDragAndDrop(TransferMode.MOVE);
			ClipboardContent content = new ClipboardContent();
			content.putString(textoSeleccionado);
			dragboard.setContent(content);
			event.consume();
		
		}

    }
    
    
    
    @FXML
    void onDragDroppedLista(DragEvent event) {
		Dragboard dragboard = event.getDragboard();
		if (dragboard.hasString()) {
			listView.getItems().add(dragboard.getString());
		}
		event.setDropCompleted(true);
		event.consume();
    }

    @FXML
    void onDragOverListView(DragEvent event) {
		if (event.getGestureSource() != listView && event.getDragboard().hasString()) {
			event.acceptTransferModes(TransferMode.MOVE);
		}
		event.consume();
    }


}