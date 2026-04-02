package ventanasdependientes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Aplicacion {

	public static void main(String[] args) {
		
		
		try {
			//UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
			//UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
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
		
		
		
		JFrame miVentana = new JFrame();
		miVentana.setSize(400, 300);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setTitle("Mi primera ventana dependiente");
		miVentana.setLocationRelativeTo(null);
		
		JLayeredPane capa = new JLayeredPane();
		miVentana.setContentPane(capa);
		
		JInternalFrame ventanaInterna = new JInternalFrame("Ventana Interna", true, true, true, true);
		ventanaInterna.setSize(200, 150);
		ventanaInterna.setLocation(50, 50);
		ventanaInterna.setVisible(true);
		capa.add(ventanaInterna);
		
		JInternalFrame ventanaInterna2 = new JInternalFrame("Ventana Interna");
		ventanaInterna2.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		ventanaInterna2.setClosable(true);
		ventanaInterna2.setMaximizable(true);
		ventanaInterna2.setIconifiable(true);
		ventanaInterna2.setResizable(true);
		ventanaInterna2.setSize(200, 150);
		ventanaInterna2.setLocation(50, 50);
		ventanaInterna2.setVisible(true);
		capa.add(ventanaInterna2);
		
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menuArchivo = new JMenu("Archivo");
		JMenuItem menuItemNuevo = new JMenuItem("Nuevo");
		JMenuItem menuItemAbrir = new JMenuItem("Abrir");
		JMenuItem menuItemSalir = new JMenuItem("Salir");
		menuItemSalir.addActionListener(actionEvent -> {
			System.exit(0);
		});
		menuArchivo.add(menuItemNuevo);
		menuArchivo.add(menuItemAbrir);
		menuArchivo.addSeparator();
		menuArchivo.add(menuItemSalir);
		menuBar.add(menuArchivo);
		
		
		
		miVentana.setJMenuBar(menuBar);
		
		
		
		
		
		
		
		
		
		
		
		miVentana.setVisible(true);
		
		
	}

}
