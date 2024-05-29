import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;



public class MainController implements Initializable {

    @FXML
    private Button button_iniciarContador;

    @FXML
    private ProgressBar progressbar_barraProgreso;

    @FXML
    private ProgressBar progressbar_barraProgreso2;
    
    @FXML
    private Text text_contador;

    @FXML
    private Rectangle shimmer_progreso;
    
    @FXML
    private ProgressBar progress_bar_conService;
    
    @FXML
    void iniciarContador(ActionEvent event) {
    	
    	Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(
            Duration.millis(100),
            event1 -> {
                double progress = progressbar_barraProgreso.getProgress();
                progressbar_barraProgreso.setProgress(progress + 0.01);
            }
        );
        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(100);
        timeline.play();

        
        Timeline shimmerTimeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(shimmer_progreso.translateXProperty(), -300)),
                new KeyFrame(Duration.seconds(2), new KeyValue(shimmer_progreso.translateXProperty(), 300))
        );
        shimmerTimeline.setCycleCount(Animation.INDEFINITE);
        shimmerTimeline.setAutoReverse(true);
        shimmerTimeline.play();
        
        
        
        
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    // Simular trabajo en segundo plano
                    Thread.sleep(100);
                    Integer numerTemp=Integer.parseInt(text_contador.getText())+1;
                    text_contador.setText(String.valueOf(numerTemp));
                    // Actualizar el progreso en el hilo de la interfaz de usuario
                    final int progress = i;
                    
                    Platform.runLater(() -> progressbar_barraProgreso2.setProgress(progress / 100.0));
                }
                return null;
            }
        };

        // Ejecutar la tarea en un hilo en segundo plano
        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();
    }



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		Thread miProceso=new Thread(() -> {
    		for (int i=0;i<100;i++)
				try {
					Integer numerTemp=Integer.parseInt(text_contador.getText())+1;
                    text_contador.setText(String.valueOf(numerTemp));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	});
    	miProceso.start();
		
    	
    	/*for (int i=0;i<100;i++)
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
    	
    	
    	
    	Service<Void> service = new Service<Void>() {
            @Override
            protected Task<Void> createTask() {
                return new Task<Void>() {
                    @Override
                    protected Void call() throws Exception {
                        for (int i = 0; i <= 100; i++) {
                            Thread.sleep(100); // Simular trabajo pesado
                            updateProgress(i, 100);
                            updateMessage("Progreso: " + i + "%");
                        }
                        return null;
                    }
                };
            }
        };

        // Vincular la barra de progreso y la etiqueta al servicio
        progress_bar_conService.progressProperty().bind(service.progressProperty());
        //statusLabel.textProperty().bind(service.messageProperty());

        // Iniciar el servicio
        service.start();
		
	}

}
