import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola Swing");
		
		JFrame frame = new JFrame("Mi Ventana");
		//frame.getContentPane()
		
		JPanel panelIzquierda= new JPanel();
		panelIzquierda.setLayout(new FlowLayout());
		for (int i=0; i<10; i++) {
			panelIzquierda.add(new JLabel("Etiqueta " + i));
		}
		//panelIzquierda.setMaximumSize(new java.awt.Dimension(200, 200));
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		frame.setMinimumSize(new java.awt.Dimension(300, 100));
		frame.setMaximumSize(new java.awt.Dimension(800, 800));
		frame.setLocationRelativeTo(null);
		
		frame.setContentPane(panel);
		
		JButton boton = new JButton("Boton");
		panel.add(boton, BorderLayout.NORTH);
		JButton boton2 = new JButton("Boton1");
		panel.add(boton2,BorderLayout.SOUTH);
		//JButton boton3 = new JButton("Boton2");
		//panel.add(boton3,BorderLayout.WEST);
		panel.add(panelIzquierda,BorderLayout.WEST);
		JButton boton4 = new JButton("Boton3");
		panel.add(boton4,BorderLayout.EAST);
		JButton boton5 = new JButton("Boton4");
		panel.add(boton5,BorderLayout.CENTER);

		
/*		boton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});*/
		ActionListener listener=evento->{
			System.out.println("Hola Mundo ->"+((JButton)evento.getSource()).getText());
		};
		boton5.addActionListener(listener);
		boton.addActionListener(listener);
		boton2.addActionListener(listener);
		boton4.addActionListener(listener);
		
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setLocationRelativeTo(null);
		
		
		frame.setVisible(true);
		
		
		
	}

}
