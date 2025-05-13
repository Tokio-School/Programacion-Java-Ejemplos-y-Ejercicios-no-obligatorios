import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.*;

public class Aplicacion extends JFrame implements ComponentListener {

   
    public Aplicacion() {
    	setLayout(null);
    	
    	JButton boton = new JButton("Botón");
    	boton.setBounds(50, 50, 100, 30);
    	add(boton);
    	
    	JTextField campoX = new JTextField();
    	campoX.setBounds(200, 50, 100, 30);
    	campoX.setBorder(BorderFactory.createEtchedBorder());
    	add(campoX);
    	
    	JTextField campoY = new JTextField();
    	campoY.setBounds(350, 50, 100, 30);
    	campoY.setBorder(BorderFactory.createEtchedBorder());
    	add(campoY);
    	
    	
    	JProgressBar barraProgreso = new JProgressBar();
		barraProgreso.setBounds(50, 150, 400, 30);
		barraProgreso.setValue(0);
		barraProgreso.setMaximum(100);
		add(barraProgreso);

    	
    	
    	
    	JLabel etiqueta = new JLabel("Hola Mundo");
    	etiqueta.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
				System.out.println("mouseEntered");
			}
    	}
    	);
    	
    	
		boton.addActionListener(e -> {
			etiqueta.setBounds(Integer.valueOf(campoX.getText()), Integer.valueOf(campoY.getText()), 200, 30);
			add(etiqueta);
			repaint();
			
			/*Thread hilo=new Thread(() -> {
				for (int i = 0; i <= 100; i++) {
					barraProgreso.setValue(i);
					try {
						Thread.sleep(100); 
					} catch (InterruptedException error) {
						error.printStackTrace();
					}
					repaint();
				}
			});
			hilo.start();*/
			SwingWorker<String,Integer> proceso=new SwingWorker<String,Integer>(){

				@Override
				protected String doInBackground() throws Exception {
					for (int i = 0; i <= 100; i++) {
						publish(i);
						try {
							Thread.sleep(100); 
						} catch (InterruptedException error) {
							error.printStackTrace();
						}
						//repaint();
					}
					return "FIN";
				}

				@Override
				protected void process(List<Integer> chunks) {
					super.process(chunks);
					System.out.println(chunks.toString());
					barraProgreso.setValue(chunks.getLast());
				}

				@Override
				protected void done() {
					// TODO Auto-generated method stub
					super.done();
					try {
						String resultado = get();
						etiqueta.setText(resultado);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			};
			proceso.execute();
			
			
		});
		
				
		
    }

    public static void main(String[] args) {
    	Aplicacion aplicacion = new Aplicacion();
		aplicacion.setTitle("Aplicación");
		aplicacion.setSize(600, 600);
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.setLocationRelativeTo(null);
		
		aplicacion.addComponentListener(aplicacion);
		
		aplicacion.setVisible(true);
		

    }

    
    
    
	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		System.out.println("componentResized");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		System.out.println("componentMoved");
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		System.out.println("componentShown");
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		System.out.println("componentHidden");
	}
}
