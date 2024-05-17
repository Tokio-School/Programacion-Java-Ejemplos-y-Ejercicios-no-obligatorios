import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
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
	}

	@FXML
	void onActionMenu1(ActionEvent event) {
		System.out.println("Menu 1");
	}

	@FXML
	void onActionMenu2(ActionEvent event) {
		System.out.println("Menu 2");
	}

	@FXML
	void onActionMenu3(ActionEvent event) {
		System.out.println("Menu 3");
	}

}
