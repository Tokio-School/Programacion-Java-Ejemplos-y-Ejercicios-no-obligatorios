import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Aplicacion {

	public static void main(String[] args) {
		
		JFrame ventana= new JFrame("Mi Ventana Formulario");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(new BorderLayout());
		
		JPanel jpFormulario= new JPanel(new GridLayout(5, 2));
		
		
		JLabel jlNombre= new JLabel("Nombre:");
		JTextField jtfNombre= new JTextField();
		jlNombre.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		jtfNombre.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		JLabel jlSoltero= new JLabel("Soltero:");
		JCheckBox jcbSoltero= new JCheckBox();
		jlSoltero.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		jcbSoltero.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		/*jcbSoltero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				
			}
			
		});*/
		
		jcbSoltero.addActionListener(evento ->{
			System.out.println(((JCheckBox)evento.getSource()).isSelected());
		});

		
		
		
		jpFormulario.add(jlNombre);
		jpFormulario.add(jtfNombre);
		jpFormulario.add(jlSoltero);
		jpFormulario.add(jcbSoltero);
		
		ventana.getContentPane().add(jpFormulario, BorderLayout.NORTH);
		
		JButton jbAceptar= new JButton("Aceptar");
		jbAceptar.addActionListener(evento -> {
			System.out.println("Hola Mundo ->" + jtfNombre.getText());
		});
		
		
		ButtonGroup grupoLenguajes= new ButtonGroup();
		JRadioButton jrbJava= new JRadioButton("Java");
		JRadioButton jrbKotlin= new JRadioButton("Kotlin");
		jrbJava.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		jrbKotlin.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		ActionListener gestorRadioButtons=evento -> {
			System.out.println("Hola Mundo ->" + ((JRadioButton)evento.getSource()).getText());
		};
		
		jrbJava.addActionListener(gestorRadioButtons);
		jrbKotlin.addActionListener(gestorRadioButtons);
		
		
		
		
		grupoLenguajes.add(jrbJava);
		grupoLenguajes.add(jrbKotlin);
		JLabel jlLenguaje= new JLabel("Lenguaje:");
		jpFormulario.add(jlLenguaje);
		jpFormulario.add(jrbJava);
		JLabel jlVacio= new JLabel("");
		jpFormulario.add(jlVacio);
		jpFormulario.add(jrbKotlin);
		jlLenguaje.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		jrbJava.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		jrbKotlin.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		//jpFormulario.add(grupoLenguajes);
		
		
		
		JLabel jlComentarios= new JLabel("Comentarios:");
		jlComentarios.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JTextArea jtaComentarios= new JTextArea(3,50);
		jtaComentarios.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		jtaComentarios.setLineWrap(true);
		jpFormulario.add(jlComentarios);
		jpFormulario.add(jtaComentarios);
		/*jtaComentarios.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hola Mundo ->" + jtaComentarios.getText());
			}
			
			
		});*/
		
		jtaComentarios.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hola Mundo ->" + jtaComentarios.getText());
			}
		});
		
		
		
		
		ventana.getContentPane().add(jbAceptar, BorderLayout.CENTER);
		
		
		ventana.setLocale(null);
		ventana.setSize(400, 700);
		ventana.setVisible(true);
		
		
		
		
		

	}

}
