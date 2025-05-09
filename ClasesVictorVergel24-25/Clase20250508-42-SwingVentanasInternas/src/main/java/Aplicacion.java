import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class Aplicacion {

	JList<String> lista2,lista;
	
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		app.iniciar();
	}
		
	public void iniciar() {	
		
		// Cargar la librera de Look and Feel FlatLaf
		try {
			//UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
			//UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JFrame frame = new JFrame("Aplicación");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);

		
		JLayeredPane panelContendedorVentanas = new JLayeredPane();
		frame.getContentPane().add(panelContendedorVentanas);
		
		JInternalFrame ventana1 = new JInternalFrame("Ventana 1");
		panelContendedorVentanas.add(ventana1);
		
		ventana1.setSize(200, 200);
		ventana1.setLocation(50, 50);
		ventana1.setResizable(true);
		ventana1.setMaximizable(true);
		ventana1.setIconifiable(true);
		ventana1.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		ventana1.setClosable(true);
		ventana1.setVisible(true);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		ventana1.setContentPane(tabbedPane);
		
		JPanel panelPestana1 = new JPanel();
		panelPestana1.setLayout(new BorderLayout());
		ImageIcon logoTokio=null;
		try {
			//logoTokio= new ImageIcon("src/main/resources/logoTokio.png");
			// Opción 1: logoTokio= new ImageIcon("src/main/resources/Logo.png");
			// Opción 2: 
			logoTokio= new ImageIcon(getClass().getResource("Logo.png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panelPestana1.add(new javax.swing.JLabel(logoTokio),BorderLayout.CENTER);
		tabbedPane.add(panelPestana1,"Pestaña 1");
		
		
		// Menús de una ventana.
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menuArchivo = new JMenu("Archivo");
		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		JMenuItem itemGuardar = new JMenuItem("Guardar");
		
		itemNuevo.addActionListener(e-> JOptionPane.showMessageDialog(null, "Opcion de Nuevo pulsada"));
		JMenuItem itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(e -> System.exit(0));
		
		
		
		menuArchivo.add(itemNuevo);
		menuArchivo.add(itemGuardar);
		menuArchivo.addSeparator();
		menuArchivo.add(itemSalir);
		
		menuBar.add(menuArchivo);
		

		frame.setJMenuBar(menuBar);
		

		
		
		JInternalFrame ventana2 = new JInternalFrame("Ventana 2");
		ventana2.setSize(200, 200);
		ventana2.setLocation(300, 50);
		ventana2.setResizable(true);
		ventana2.setMaximizable(true);
		ventana2.setIconifiable(true);
		ventana2.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		ventana2.setClosable(true);
		ventana2.setVisible(true);
		
		
		ventana2.getContentPane().setLayout(new BorderLayout());
		
		
		 lista = new JList<String>();
		DefaultListModel<String> modeloLista = new DefaultListModel<String>();
		modeloLista.addElement("Elemento 1");
		modeloLista.addElement("Elemento 2");
		lista.setModel(modeloLista);
		lista.setBorder(BorderFactory.createEtchedBorder());
		lista.setTransferHandler(new ListaTransferHandler());
		ventana2.getContentPane().add(lista, BorderLayout.WEST);
		

		
		lista2 = new JList<String>();
		DefaultListModel<String> modeloLista2 = new DefaultListModel<String>();
		modeloLista2.addElement("Elemento 3");
		modeloLista2.addElement("Elemento 4");
		lista2.setModel(modeloLista2);
		lista2.setBorder(BorderFactory.createEtchedBorder());
		lista2.setTransferHandler(new ListaTransferHandler());
		ventana2.getContentPane().add(lista2, BorderLayout.EAST);
		
		
		JTextArea areaTexto = new JTextArea();
		areaTexto.setDragEnabled(true);
		ventana2.getContentPane().add(areaTexto, BorderLayout.CENTER);
		
		
		panelContendedorVentanas.add(ventana2);
		
		frame.setVisible(true);
		
		
	}
	
	class ListaTransferHandler extends TransferHandler {

		@Override
		public boolean importData(TransferSupport support) {
			
			Transferable transferable= support.getTransferable();
			
			String data=null;
			try {
				data = transferable.getTransferData(DataFlavor.stringFlavor).toString();
			} catch (UnsupportedFlavorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(data);
			

			
			DefaultListModel<String> modeloLista = (DefaultListModel<String>) lista.getModel();
			DefaultListModel<String> modeloLista2 = (DefaultListModel<String>) lista2.getModel();
			modeloLista.addElement(data);
			modeloLista2.addElement(data);

			return true;
		}

		@Override
		public boolean canImport(TransferSupport support) {
			// TODO Auto-generated method stub
			return true;
		}
		
		
		
		
	}
	

}
