import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AplicacionVentanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
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
		
		
		
		JFrame ventana = new JFrame();
		ventana.setSize(500, 500);
		ventana.setTitle("Mi primera ventana");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.getContentPane().setLayout(new BorderLayout());
		
		
		JPanel panelCentral = new JPanel();
		
		MiTextField textField1 = new MiTextField("nombre");
		//textField1.setName("nombre");
		panelCentral.add(textField1);
		
		MiTextField textField2 = new MiTextField("edad");
		//textField2.setName("edad");
		panelCentral.add(textField2);
		
		MiTextField textField3 = new MiTextField("direccion");
		//textField3.setName("direccion");
		panelCentral.add(textField3);
		
		
		
		
		JButton boton = new JButton("Guardar");
		boton.addActionListener(e -> {
			/*System.out.println("Nombre: " + textField1.getText());
			System.out.println("Edad: " + textField2.getText());
			System.out.println("Direccion: " + textField3.getText());*/
			Component componentes[]=((JButton)e.getSource()).getParent().getComponents();
			for (Component componente : componentes) {
				if (componente instanceof MiTextField) {
					System.out.println(
							((MiTextField) componente).getName() + ": " + ((MiTextField) componente).getText());
				}
			}
			//Crear un objeto de tipo Persona con los datos de los campos, a partir de la reflexión, sabiendo que tenemos como nombre de accion el nombre del campo

		});
		panelCentral.add(boton);
		
		
		
		
		JMenuBar menu = new JMenuBar();
		JMenu jm_listado=new JMenu("Listado");
		JMenu jm_ayuda=new JMenu("Ayuda");
		menu.add(jm_listado);
		menu.add(jm_ayuda);
		
		JMenuItem jmi_listado1=new JMenuItem("Listado 1");
		JMenuItem jmi_listado2=new JMenuItem("Listado 2");
		JMenuItem jmi_listado3=new JMenuItem("Listado 3");
		jm_listado.add(jmi_listado1);
		jm_listado.add(jmi_listado2);
		jm_listado.add(jmi_listado3);
		
		ActionListener gestorMenus=e -> {
			System.out.println(e.getActionCommand()+" seleccionado");
		};
		jmi_listado1.addActionListener(gestorMenus);
		jmi_listado2.addActionListener(gestorMenus);
		jmi_listado3.addActionListener(gestorMenus);
		
		ventana.setJMenuBar(menu);
		
		
		ventana.add(panelCentral,BorderLayout.CENTER);
		
		ventana.setVisible(true);
	}
	
	
	
}


class MiTextField extends JTextField implements FocusListener{

	public MiTextField(String nombreDato) {
		this.setSize(new Dimension(150, 30));
		this.setMinimumSize(new Dimension(150, 30));
		this.setPreferredSize(new Dimension(150, 30));
		this.setForeground(Color.GRAY);
		this.setText("Inserte "+nombreDato);
		this.setToolTipText(nombreDato);
		this.setName(nombreDato);
		this.addFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		this.setText("");
		this.setForeground(Color.BLACK);
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(this.getText().isEmpty())
		{
			this.setForeground(Color.GRAY);
			this.setText("Inserte "+getName());
		}
	}
}
