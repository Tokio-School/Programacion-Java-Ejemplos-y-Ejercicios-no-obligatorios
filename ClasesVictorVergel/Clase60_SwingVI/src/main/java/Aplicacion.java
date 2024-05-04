import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.TransferHandler;

public class Aplicacion {

	public Aplicacion() {
		// TODO Auto-generated constructor stub
		inicializarGUI();
	}
	
	
	
	private void inicializarGUI() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				JFrame ventana = new JFrame("Ventana principal");
				ventana.setSize(600, 400);
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventana.setLocationRelativeTo(null);
				
				JLayeredPane panelCapas = new JLayeredPane();
				ventana.getContentPane().add(panelCapas);
				
				
				
				panelCapas.add(crearVentana("Ventana 1"), JLayeredPane.DEFAULT_LAYER);
				panelCapas.add(crearVentana("Ventana 2"), JLayeredPane.PALETTE_LAYER);
				panelCapas.add(crearVentana("Ventana 3"), JLayeredPane.MODAL_LAYER);
				JInternalFrame internalFrame4 = crearVentana("Ventana 4");
				panelCapas.add(internalFrame4, JLayeredPane.POPUP_LAYER);
				
				JTabbedPane tabbedPane = new JTabbedPane();
				internalFrame4.setContentPane(tabbedPane);
				JPanel panelPestana1=new JPanel();
				ImageIcon icon =null;
				try {
					icon=new ImageIcon(this.getClass().getResource("tokio.png"));
					//icon=new ImageIcon("src/main/resources/tokio.png");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				panelPestana1.add(new JLabel(icon));

				tabbedPane.add(panelPestana1, "Tab 1");
				JPanel panelPestana2=new JPanel();
				tabbedPane.add(panelPestana2, "Tab 2");
				panelPestana2.setLayout(new BorderLayout());
				JLabel etiqueta=new JLabel("Segundo Panel");
				panelPestana2.add(etiqueta, BorderLayout.NORTH);
				JTextArea textArea=new JTextArea();
				textArea.setLineWrap(true);
				JScrollPane scrollPane = new JScrollPane(textArea);
				panelPestana2.add(scrollPane, BorderLayout.WEST);
				textArea.setBorder(BorderFactory.createEtchedBorder());
				textArea.setPreferredSize(new java.awt.Dimension(150, 200));
				
				
				JList jl_lista=new JList();
				jl_lista.setPreferredSize(new Dimension(150,200));
				//jl_lista.setListData(new String[] {"Elemento 1","Elemento 2"});
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				modelo.addElement("Elemento 1");
				modelo.addElement("Elemento 2");
					
				jl_lista.setModel(modelo);
				jl_lista.setBorder(BorderFactory.createEtchedBorder());
				panelPestana2.add(jl_lista, BorderLayout.CENTER);
				
				
				
				//Arrastrar y soltar el textarea en el JList
				//textArea.setTransferHandler(new TransferHandler("text"));
				textArea.setDragEnabled(true);
				
				
				jl_lista.setTransferHandler(new ListaTransferHandler());
				
				ventana.setVisible(true);
	}



	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		
	}
	
	public JInternalFrame crearVentana(String nombreVentana)
	{
		JInternalFrame internalFrame1 = new JInternalFrame();
		internalFrame1.setSize(400, 200);
		internalFrame1.setTitle(nombreVentana);
		internalFrame1.setClosable(true);
		internalFrame1.setResizable(true);
		internalFrame1.setMaximizable(true);
		internalFrame1.setIconifiable(true);
		internalFrame1.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		internalFrame1.setVisible(true);
		return internalFrame1;
	}

	class ListaTransferHandler extends TransferHandler
	{
		@Override
		public boolean canImport(TransferSupport support) {
			// TODO Auto-generated method stub
			return true;
		}
		
		@Override
		public boolean importData(TransferSupport support) {
			// TODO Auto-generated method stub
			JList lista = (JList) support.getComponent();
			String texto = null;
			Transferable transferable= support.getTransferable();
            String data=null;
            
			try {
				data = (String) transferable.getTransferData(DataFlavor.stringFlavor);
			} catch (UnsupportedFlavorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Data: " + data+" - "+support.getComponent());
            
			try {
				texto = (String) support.getTransferable().getTransferData(DataFlavor.stringFlavor);
			} catch (UnsupportedFlavorException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DefaultListModel<String> modelo = (DefaultListModel<String>) lista.getModel();
			modelo.addElement(data);
			
			return true;
		}
	}
}
