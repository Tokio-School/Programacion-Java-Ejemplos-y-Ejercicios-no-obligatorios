import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

public class Aplicacion extends javax.swing.JFrame {

	JProgressBar barra;
	public Aplicacion() {
		setSize(500,400);
		setTitle("Posicionamiento absoluto en la ventana");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		JLabel saludo = new JLabel("Hola, soy un saludo");
		/*saludo.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});*/
		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("Posición del mouse: " + e.getX() + ", " + e.getY());
				saludo.setText(e.getX() + ", " + e.getY());
			}
		});
		setLayout(null);
		saludo.setBounds(50, 50, 200, 30);
		add(saludo);
		
		
		JLabel etiquetaX = new JLabel("Valor X");
		etiquetaX.setBounds(50, 80, 120, 20);
		add(etiquetaX);
		JLabel etiquetaY = new JLabel("Valor Y");
		etiquetaY.setBounds(250, 80, 120, 20);
		add(etiquetaY);
		
		JTextField textoX = new JTextField();
		textoX.setDragEnabled(true);
		textoX.setTransferHandler(new javax.swing.TransferHandler("text"));
		textoX.setBounds(50, 100, 120, 30);
		add(textoX);
		
		JTextField textoY = new JTextField();
		textoY.setBounds(250, 100, 120, 30);
		textoY.setDragEnabled(true);
		textoY.setToolTipText("Ingrese el valor Y para mover el saludo");
		textoY.setTransferHandler(new javax.swing.TransferHandler("text"));
		add(textoY);
		
		JButton boton = new JButton("Mover");
		boton.setBounds(150, 150, 120, 30);
		add(boton);
		boton.addActionListener(e -> {
			int x = Integer.parseInt(textoX.getText());
			int y = Integer.parseInt(textoY.getText());
			saludo.setLocation(x, y);
		});

		
		barra = new JProgressBar();
		barra.setBounds(50, 200, 300, 30);
		barra.setMinimum(0);
		barra.setMaximum(100);

		/*Thread hilo = new Thread(() ->
		{
			for (int i = 0; i <= 10000; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				barra.setValue(i);
			}
		});
		hilo.start();*/
		
		class HiloBarra extends SwingWorker {

			@Override
			protected Object doInBackground() throws Exception {
				for (int i = 0; i <= 100; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					publish(i);
				}
				return null;
			}

			@Override
			protected void process(List chunks) {
				// TODO Auto-generated method stub
				super.process(chunks);
				
				int datoProgreso=(int) chunks.get(chunks.size() - 1);
				barra.setValue(datoProgreso);
				System.out.println("Valor del progreso: " + datoProgreso);
				repaint();
				
			}
		}
		HiloBarra hilo = new HiloBarra();
		hilo.execute();

		add(barra);
	}
	
	
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		
		app.setVisible(true);
		

	}
}

