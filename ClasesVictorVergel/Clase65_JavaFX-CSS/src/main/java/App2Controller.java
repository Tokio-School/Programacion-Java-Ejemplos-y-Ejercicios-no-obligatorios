import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class App2Controller implements Initializable {

    @FXML
    private Accordion panelAcordeon;

    @FXML
    private TabPane panelPestanas;
    
   /* @FXML
    private AnchorPane anchorPaneMensaje1;*/

    @FXML
    private TreeView<String> treeViewDatos;
    
    @FXML
    private TextField textField_dato;
    
    @FXML
    private ListView<String> listView;

    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		((VBox)panelPestanas.getParent()).prefWidthProperty().bind(((AnchorPane)((VBox)panelPestanas.getParent()).getParent()).widthProperty());
		panelPestanas.prefWidthProperty().bind(((VBox)panelPestanas.getParent()).widthProperty());
		panelAcordeon.prefWidthProperty().bind(((AnchorPane)panelAcordeon.getParent()).widthProperty());
		//anchorPaneMensaje1.prefWidthProperty().bind(((AnchorPane)panelAcordeon.getParent()).widthProperty());
		
		
		//Inicializamos el TreeView
		TreeItem<String> root = new TreeItem<>("INICIO");
		treeViewDatos.setRoot(root);
		
		// Inicializalizamos el ListView
		listView.getItems().add("Elemento 1");
		listView.getItems().add("Elemento 2");
		listView.getItems().add("Elemento 3");
		
	}

	@FXML
	void onActionMenu1(ActionEvent event) {
		System.out.println("Menu 1");
		
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error de sistema");
		alert.setHeaderText("Error en la aplicación no definido");
		alert.setContentText("Se ha producido un error en la aplicación que no ha sido definido. Por favor, contacte con el administrador del sistema.");
		alert.showAndWait();
		
		
		TextInputDialog dialog = new TextInputDialog("Información de usuario");
		dialog.setTitle("Información de usuario");
		dialog.setHeaderText("Introduzca su nombre de usuario");
		dialog.setContentText("Nombre de usuario:");
		Optional<String> respuesta=dialog.showAndWait();
		if (respuesta.isPresent()) {
			System.out.println("Nombre de usuario: "+respuesta.get());
		}
		
		
		Alert alert2 = new Alert(AlertType.CONFIRMATION);
		alert2.setTitle("Información de usuario");
		alert2.setHeaderText("Información de usuario");
		alert2.setContentText("Nombre de usuario: "+respuesta.get());
		Optional<ButtonType> respuesta2=alert2.showAndWait();
		if (respuesta2.get()==ButtonType.OK) {
            System.out.println("Botón OK pulsado");
        } else if (respuesta2.get()==ButtonType.CANCEL) {
        	System.out.println("Botón Cancelar pulsado");
        }
		
	}

	@FXML
	void onActionMenu2(ActionEvent event) {
		System.out.println("Menu 2");
		
		ChoiceDialog<String> dialog = new ChoiceDialog<>("","Opción 1", "Opción 2", "Opción 3");
		dialog.setTitle("Selección de opción");
		dialog.setHeaderText("Seleccione una opción");
		Optional<String> respuesta= dialog.showAndWait();
		if (respuesta.isPresent()) {
			System.out.println("Opción seleccionada: " + respuesta.get());
		} else {
			System.out.println("No se ha seleccionado ninguna opción");
		}
		
	}

	@FXML
	void onActionMenu3(ActionEvent event) {
		System.out.println("Menu 3");
	}
	
	
    @FXML
    void onkeyReleased(KeyEvent event) {
    	
		//if (event.getCode().toString().equals("ENTER")) {
    	if (event.getCode()==KeyCode.ENTER) {
			System.out.println("Ha pulsado INTRO");
			System.out.println(textField_dato.getText());
			String dato=textField_dato.getText();
			listView.getItems().add(dato);
			treeViewDatos.getRoot().getChildren().add(new TreeItem<>(dato));
			textField_dato.clear();
		}
    }
    
    
    @FXML
    void onMouseClickedLista(MouseEvent event) {
		if (event.getClickCount() == 2) {
			System.out.println("Doble click");
			String dato = listView.getSelectionModel().getSelectedItem();
			System.out.println("Elemento seleccionado: " + dato);
			listView.getItems().remove(dato);
		}
    }
    
    
    @FXML
    void onDragDetectedDato(MouseEvent event) {
    	System.out.println("Drag detectado");
    	String selectedText = textField_dato.getSelectedText();
        if (!selectedText.isEmpty()) {
            Dragboard dragboard = textField_dato.startDragAndDrop(TransferMode.MOVE);
            ClipboardContent content = new ClipboardContent();
            content.putString(selectedText);
            dragboard.setContent(content);
            event.consume();
        }
    }
    
    @FXML
    void onDragOverTextView(DragEvent event) {
    	if (event.getGestureSource() != textField_dato && event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.COPY);
        }
        event.consume();
    }
    
    
    @FXML
    void onDragDroppedLista(DragEvent event) {
    	 System.out.println("Drag soltado");
    	 Dragboard dragboard = event.getDragboard();
         boolean success = false;
         if (dragboard.hasString()) {
             listView.getItems().add(dragboard.getString());
             success = true;
         }
         event.setDropCompleted(success);
         event.consume();
    }

}
