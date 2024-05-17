import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.web.HTMLEditor;

public class AppController implements Initializable {

    @FXML
    private Button b_Guardar;

    @FXML
    private ComboBox<String> cb_desplegableCiudades;

    @FXML
    private CheckBox cb_soltero;

    @FXML
    private ColorPicker cp_ColorFavorito;

    @FXML
    private DatePicker dp_fechaNacimiento;

    @FXML
    private HTMLEditor html_editor;

    @FXML
    private ListView<String> lv_ciudades;

    @FXML
    private TextField tf_nombre;

    @FXML
    private TableView<Dato> tv_tablaDatos;

    @FXML
    private TextField tf_c1;

    @FXML
    private TextField tf_c2;
    
    @FXML
    private MediaView media_reproduccion;
    
    
    @FXML
    private TableColumn<Dato, String> col_c1;

    @FXML
    private TableColumn<Dato, String> col_c2;
    
    
    
    @FXML
    void cambiarColorFondo(MouseEvent event) {
    	b_Guardar.setStyle("-fx-background-color: #"+cp_ColorFavorito.getValue().toString().substring(2, 8));
    }

    @FXML
    void guardar(ActionEvent event) {
    	System.out.println("Nombre: "+tf_nombre.getText());
    	System.out.println("Fecha de nacimiento: "+dp_fechaNacimiento.getValue());
    	System.out.println("Ciudad: "+cb_desplegableCiudades.getValue());
    	System.out.println("Soltero: "+cb_soltero.isSelected());
    	System.out.println("Color favorito: "+cp_ColorFavorito.getValue());
    	System.out.println("HTML: "+html_editor.getHtmlText());
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		String ciudades[] = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao"};
		cb_desplegableCiudades.getItems().addAll(ciudades);
		
		lv_ciudades.getItems().addAll(ciudades);
		
		
		// Inicializamos el mediaView
		Media video=new Media(getClass().getResource("video_informatica.mp4").toExternalForm());
		media_reproduccion.setMediaPlayer(new javafx.scene.media.MediaPlayer(video));
		media_reproduccion.getMediaPlayer().setAutoPlay(false);
		
		
		
		// Inicializamos la tabla
		col_c1.setCellValueFactory(new PropertyValueFactory<Dato,String>("c1"));
		col_c2.setCellValueFactory(new PropertyValueFactory<Dato,String>("c2"));
	}

	
    @FXML
    void omc_ListView(MouseEvent event) {
		if (event.getClickCount() == 2) {
			System.out.println(lv_ciudades.getSelectionModel().getSelectedItem());
		}
    }
    
    
    @FXML
    void oa_BotonGuardarTabla(ActionEvent event) {
		System.out.println("Ciudad 1: " + tf_c1.getText());
		System.out.println("Ciudad 2: " + tf_c2.getText());
		
		Dato d = new Dato(tf_c1.getText(), tf_c2.getText());
		tv_tablaDatos.getItems().add(d);
    }
    
    @FXML
    void onMouseClickedTabla(MouseEvent event) {
		if (event.getClickCount() == 2) {
			Dato d = tv_tablaDatos.getSelectionModel().getSelectedItem();
			System.out.println("Dato seleccionado: " + d);
		}
    }
    
    
}
