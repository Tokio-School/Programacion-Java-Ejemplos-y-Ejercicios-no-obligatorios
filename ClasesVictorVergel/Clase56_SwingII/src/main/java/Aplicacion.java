import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;

public class Aplicacion {

	public static void main(String[] args) {
		
		try {
			//UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		JFrame jframe = new JFrame("Aplicacion de componentes Swing");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(500, 400);
		
		Image imageIcon = Toolkit.getDefaultToolkit().getImage(Aplicacion.class.getResource("icono.png"));
		jframe.setIconImage(imageIcon);
		
		BorderLayout borderLayout = new BorderLayout();
		jframe.setLayout(borderLayout);
		
		
		JPanel panelNorte = new JPanel();
		FlowLayout flowLayout = new FlowLayout();
		panelNorte.setLayout(flowLayout);
		
		TitledBorder tittleBorder = new TitledBorder("Selecciona un lenguaje de programacion");
		ButtonGroup grupo = new ButtonGroup();
		panelNorte.setBorder(tittleBorder);
		
		JRadioButton jrbOpcionjava= new JRadioButton("Java");
		JRadioButton jrbOpcionUnity= new JRadioButton("Unity");
		JRadioButton jrbOpcionC= new JRadioButton("C");
		JRadioButton jrbOpcionPython= new JRadioButton("Python");
		
		grupo.add(jrbOpcionjava);
		grupo.add(jrbOpcionUnity);
		grupo.add(jrbOpcionC);
		grupo.add(jrbOpcionPython);
		
		panelNorte.add(jrbOpcionjava);
		panelNorte.add(jrbOpcionUnity);
		panelNorte.add(jrbOpcionC);
		panelNorte.add(jrbOpcionPython);
		
		jframe.getContentPane().add(panelNorte, BorderLayout.NORTH);
		
		

		JToggleButton jToggleButton = new JToggleButton("Activar");
		jToggleButton.setMinimumSize(new Dimension(140,200));
		jToggleButton.setPreferredSize(new Dimension(140,200));
		
		jframe.getContentPane().add(jToggleButton, BorderLayout.WEST);
		jToggleButton.addActionListener((e) -> {
            //jToggleButton.setText(jToggleButton.isSelected() ? "Activar" : "Desactivar");
			((JToggleButton)e.getSource()).setText(((JToggleButton)e.getSource()).isSelected() ? "Activar" : "Desactivar");
			
			/*jrbOpcionjava.setEnabled(((JToggleButton)e.getSource()).isSelected());
			jrbOpcionUnity.setEnabled(((JToggleButton)e.getSource()).isSelected());
			jrbOpcionC.setEnabled(((JToggleButton)e.getSource()).isSelected());
			jrbOpcionPython.setEnabled(((JToggleButton)e.getSource()).isSelected());*/
			
			for(int i=0; i<grupo.getButtonCount();i++)
			{
				grupo.getElements().nextElement().setEnabled(((JToggleButton)e.getSource()).isSelected());
            }

			
			grupo.clearSelection();
			
				
        });
		
		
		JPanel panelEste=new JPanel();
		GridBagLayout gridLayout = new GridBagLayout();
		GridBagConstraints constraintLayout = new GridBagConstraints();
		constraintLayout.insets = new Insets(3,3,3,3);
		panelEste.setLayout(gridLayout);
		
		//constraintLayout.fill = GridBagConstraints.HORIZONTAL;
		constraintLayout.gridx=0;
		constraintLayout.gridy=0;
		constraintLayout.gridwidth=2;
		JLabel jlDatos= new JLabel("Datos");
		panelEste.add(jlDatos,constraintLayout);
		
		
		
		constraintLayout.gridx=0;
		constraintLayout.gridy=1;
		constraintLayout.gridwidth=1;
		JLabel jlNombre= new JLabel("Nombre:");
		jlNombre.setHorizontalAlignment(JLabel.LEFT);
		panelEste.add(jlNombre,constraintLayout);
		
		constraintLayout.gridx=1;
		constraintLayout.gridy=1;
		JTextField jtfNombre= new JTextField();
		jtfNombre.setColumns(15);
		panelEste.add(jtfNombre,constraintLayout);
		
		
		constraintLayout.gridx=0;
		constraintLayout.gridy=2;
		JLabel jlPassword= new JLabel("Contraseña:");
		jlPassword.setHorizontalAlignment(JLabel.LEFT);
		panelEste.add(jlPassword,constraintLayout);
		
		constraintLayout.gridx=1;
		constraintLayout.gridy=2;
		JPasswordField jpf_contrasena= new JPasswordField();
		
		panelEste.add(jpf_contrasena,constraintLayout);
		jpf_contrasena.setColumns(15);
		jframe.getContentPane().add(panelEste, BorderLayout.EAST);
		
		
		
		jpf_contrasena.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.print(e.getKeyChar());
				System.out.println(jpf_contrasena.getPassword());
				
			}
		});
		
		
		
		
		
		JButton botonEnviar = new JButton("Enviar");
		jframe.getContentPane().add(botonEnviar, BorderLayout.SOUTH);
		botonEnviar.addActionListener((e) -> {
			System.out.println("Boton enviar");
		});
		
		
		
		
		
		jframe.setVisible(true);
		
	}

}
