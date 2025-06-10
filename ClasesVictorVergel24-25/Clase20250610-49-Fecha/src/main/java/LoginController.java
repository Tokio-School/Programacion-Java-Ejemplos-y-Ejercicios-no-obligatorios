import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private DatePicker datePicker_fecha;
    
    @FXML
    private Spinner<Integer> horas;

    @FXML
    private Spinner<Integer> minutos;

    @FXML
    private Spinner<Integer> segundos;


    @FXML
    void onActionSeleccionFecha(ActionEvent event) {
    	System.out.println(datePicker_fecha.getValue().toString());
    	
    	
    	int horasInteger = horas.getValue();
    	int minutosInteger = minutos.getValue();
    	int segundosInteger = segundos.getValue();
    	
    	
		System.out.println(LocalDateTime.of(datePicker_fecha.getValue(),
				LocalTime.of(horasInteger, minutosInteger, segundosInteger)).toString());
    	
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
    	datePicker_fecha.setValue(LocalDate.of(2023, 10, 1));
    	
    	horas.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, 12));
    	minutos.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0));
    	segundos.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0));
    	
	}
   
}
