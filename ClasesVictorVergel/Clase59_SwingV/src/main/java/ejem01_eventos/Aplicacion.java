package ejem01_eventos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame();
		ventana.setSize(400, 200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ventana.setTitle("Aplicación con eventos");

		GestorEventos2 gev = new GestorEventos2();
		ventana.addWindowListener(gev);
		/*
		 * GestorEventosVentana gevAntiguo=new GestorEventosVentana();
		 * ventana.addComponentListener(gevAntiguo);
		 */

		ventana.getContentPane().setLayout(null);
		JLabel jlPunteroRaton = new JLabel();
		jlPunteroRaton.setText("Puntero del ratón");
		jlPunteroRaton.setBounds(10, 10, 200, 30);
		ventana.getContentPane().add(jlPunteroRaton);

		GestorRaton gr = new GestorRaton(jlPunteroRaton);
		ventana.getContentPane().addMouseListener(gr);

		JTextField jtf1 = new JTextField();
		jtf1.setBounds(10, 50, 100, 30);
		ventana.getContentPane().add(jtf1);

		JTextField jtf2 = new JTextField();
		jtf2.setBounds(10, 90, 100, 30);
		ventana.getContentPane().add(jtf2);

		GestorFoco gf = new GestorFoco();
		jtf1.addFocusListener(gf);
		jtf2.addFocusListener(gf);

		JSpinner js = new JSpinner();
		js.setBounds(120, 50, 100, 30);
		String valores[] = { "uno", "dos", "tres" };
		js.setModel(new javax.swing.SpinnerListModel(valores));
		GestorOpciones go = new GestorOpciones();
		js.addChangeListener(go);
		ventana.getContentPane().add(js);

		JProgressBar jp = new JProgressBar();
		jp.setBounds(120, 90, 100, 30);
		jp.setMinimum(0);
		jp.setValue(0);
		jp.setMaximum(100);
		ventana.getContentPane().add(jp);

		JButton jb = new JButton("Iniciar progreso");
		jb.setBounds(240, 90, 100, 30);
		jb.addActionListener(e -> {
			System.out.println("Iniciando progreso");

			Thread procesoContador = new Thread(() -> {

				for (int i = 0; i < 100; i++) {
					jp.setValue(jp.getValue() + 1);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			procesoContador.start();
		});
		ventana.getContentPane().add(jb);

		ventana.setVisible(true);
	}

}
