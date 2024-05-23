import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import com.gluonhq.charm.glisten.control.DropdownButton;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;

public class App2Controller implements Initializable {
    @FXML
    private BorderPane borderPane;
    
    @FXML
    private SplitPane splitPane;

    @FXML
    private TextField textFieldNombre;
    
    @FXML
    private BottomNavigationButton botonMovil;

    
    @FXML
    private ListView<String> listView;
    @FXML
    private DropdownButton dropdownButton;

    
    @FXML
    private TreeView<String> treeView;

    @FXML
    private com.gluonhq.charm.glisten.control.TextField textFieldMovil;

   /* @FXML
    void onActionBotonMovil(ActionEvent event) {
		System.out.println("Botón móvil pulsado");
	}*/
    
    
	
	 	@FXML
	    void onaction_edit(ActionEvent event) {
	 		
	    }

	    @FXML
	    void onaction_file(ActionEvent event) {
	    	System.out.println("Prueba");
	 		Alert alert = new Alert(Alert.AlertType.INFORMATION);
	        alert.setTitle("Información");
	        alert.setHeaderText(null);
	        alert.setContentText("Esto es un mensaje de información.");
	        alert.showAndWait();
	        
	        
	        
	        TextInputDialog dialog = new TextInputDialog();
	        dialog.setTitle("Ingrese su nombre");
	        dialog.setHeaderText("INSERCIÓN DE DATOS");
	        dialog.setContentText("Nombre:");

	        Optional<String> result = dialog.showAndWait();
	        result.ifPresent(nombre -> System.out.println("Hola, " + nombre + "!"));
	        
	        
	        Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
	        alert2.setTitle("Confirmación");
	        alert2.setHeaderText(null);
	        alert2.setContentText("¿Estás seguro de querer continuar?");

	        Optional<ButtonType> result2 = alert2.showAndWait();
	        if (result2.isPresent() && result2.get() == ButtonType.OK) {
	            System.out.println("Se presionó OK");
	        } else {
	            System.out.println("Se presionó Cancelar o se cerró la ventana");
	        }
	        
	        ObservableList<String> choices = FXCollections.observableArrayList("Opción 1", "Opción 2", "Opción 3");
	        ChoiceDialog<String> dialog2 = new ChoiceDialog<>("Opción 1", choices);
	        dialog2.setTitle("Seleccione una opción");
	        dialog2.setHeaderText(null);
	        dialog2.setContentText("Seleccione:");

	        Optional<String> result3 = dialog2.showAndWait();
	        result3.ifPresent(System.out::println);
	    }

	    @FXML
	    void onaction_help(ActionEvent event) {

	    }

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			// Queremos que el SplitPane se expanda a todo el tamaño diponible
			splitPane.prefWidthProperty().bind(borderPane.widthProperty());
			splitPane.prefHeightProperty().bind(borderPane.heightProperty());
			
			
			//Inicializar el listView
			 ObservableList<String> personas = FXCollections.observableArrayList();
			 personas.addAll("uno","dos","tres");
			 listView.setItems(personas);
			 
			 
			 // Inicializar el TreeView
			 TreeItem<String> root = new TreeItem<>("Inicio");
			 treeView.setRoot(root);
			 treeView.prefWidthProperty().bind(borderPane.widthProperty());
			 treeView.prefHeightProperty().bind(borderPane.heightProperty());
		}

		

	    @FXML
	    void onkeypressedPulsandoIntro(KeyEvent event) {
			if (event.getCode().toString().equals("ENTER")) {
				
				String texto = textFieldNombre.getText();
				listView.getItems().add(texto);
				listView.refresh();
				System.out.println("Se ha pulsado la tecla Enter "+ ((TextField)event.getSource()).getText());
				textFieldNombre.clear();
				
				
				treeView.getRoot().getChildren().add(new TreeItem<String>(texto));
			}
	    }
	    
	    
	    @FXML
	    void onMouseClickedListaView(MouseEvent event) {
			if (event.getClickCount() == 2) {
				System.out.println("Doble click");
				listView.getItems().remove(listView.getSelectionModel().getSelectedItem());
			}
	    }
	    
	    @FXML
	    void onDragDetected(MouseEvent event) {
	    	 String selectedText = textFieldNombre.getSelectedText();
            if (!selectedText.isEmpty()) {
                Dragboard dragboard = textFieldNombre.startDragAndDrop(TransferMode.MOVE);
                ClipboardContent content = new ClipboardContent();
                content.putString(selectedText);
                dragboard.setContent(content);
                event.consume();
            }
	    }
	    
	    @FXML
	    void onDragDroppedListView(DragEvent event) {
	    	 Dragboard dragboard = event.getDragboard();
            boolean success = false;
            if (dragboard.hasString()) {
                listView.getItems().add(dragboard.getString());
                success = true;
            }
            event.setDropCompleted(success);
            event.consume();
        }

	    @FXML
	    void onDragOverTextView(DragEvent event) {
	    	if (event.getGestureSource() != textFieldNombre && event.getDragboard().hasString()) {
                event.acceptTransferModes(TransferMode.COPY);
            }
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
