import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jfPrincipal=new JFrame("Ventana Principal");
		jfPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfPrincipal.setSize(800, 600);
		jfPrincipal.setLocationRelativeTo(null);
		jfPrincipal.getContentPane().setLayout(new FlowLayout());
		
		
		JButton jbJFrame=new JButton("Abrir JFrame");
		jbJFrame.addActionListener(e -> { {
				// TODO Auto-generated method stub
				JFrame jfNoDependiente=new JFrame("Ventana No Dependiente");
				jfNoDependiente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				jfNoDependiente.setSize(400, 300);
				jfNoDependiente.setLocationRelativeTo(null);
				jfNoDependiente.setVisible(true);
			}
		});
		
		
		JButton jbJDialog=new JButton("Abrir JDialog");
		jbJDialog.addActionListener(e -> { {
				// TODO Auto-generated method stub
				JDialog jdDependiente=new JDialog(jfPrincipal,"Ventana Dependiente",true);
				jdDependiente.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				jdDependiente.setSize(400, 300);
				jdDependiente.setLocationRelativeTo(null);
				
				jdDependiente.getContentPane().setLayout(new FlowLayout());
				JTextField jtfTexto=new JTextField();
				jtfTexto.setColumns(20);
				jdDependiente.getContentPane().add(jtfTexto);
				
				
				JButton jbCerrar=new JButton("Cerrar");
				jbCerrar.addActionListener(eVentanaDependiente -> {
						// TODO Auto-generated method stub
						jdDependiente.dispose();
					}
				);
				jdDependiente.getContentPane().add(jtfTexto);
				jdDependiente.getContentPane().add(jbCerrar);
				
				
				jdDependiente.setVisible(true);
				
			}
		});
		
		
		JButton jbJOptionPane=new JButton("Abrir JOptionPane");
		jbJOptionPane.addActionListener(e -> { {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(jfPrincipal, "Hola Mundo", "Saludo", JOptionPane.INFORMATION_MESSAGE);
				//JOptionPane.showMessageDialog(jfPrincipal, "Hola Mundo", "Saludo", JOptionPane.WARNING_MESSAGE);
				//JOptionPane.showMessageDialog(jfPrincipal, "Hola Mundo", "Saludo", JOptionPane.ERROR_MESSAGE);
				String nombre=JOptionPane.showInputDialog(jfPrincipal, "Ingrese su Nombre", "Entrada", JOptionPane.QUESTION_MESSAGE);
				if (JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(jfPrincipal, "¿Desea Continuar "+nombre+"?", "Confirmación", JOptionPane.YES_NO_OPTION))
					System.out.println("Si");
				else
					System.out.println("No");
				
				
			}
		});
		
		
		JScrollPane jspTexto=new JScrollPane();
		jspTexto.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		JTextArea jtaTexto=new JTextArea();
		jtaTexto.setColumns(50);
		jtaTexto.setLineWrap(true);
		jtaTexto.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto"));
		jtaTexto.setRows(10);
		jspTexto.setViewportView(jtaTexto);
		
		
		JButton jbJFileChooser=new JButton("Abrir JFileChooser");
		jbJFileChooser.addActionListener(e -> { {
				// TODO Auto-generated method stub
				JFileChooser jfcArchivo=new JFileChooser();
				jfcArchivo.setDialogTitle("Abrir Archivo");
				
				jfcArchivo.setCurrentDirectory(new java.io.File(Aplicacion.class.getProtectionDomain().getCodeSource().getLocation().getPath()));
				jfcArchivo.showOpenDialog(jbJFileChooser);
				
				File file=jfcArchivo.getSelectedFile();
				BufferedReader brArchivo=null;
				try {
					brArchivo = new BufferedReader(new FileReader(file));
					String linea = null;
					while ((linea = brArchivo.readLine()) != null)
						  jtaTexto.append(linea+"\n");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						brArchivo.close();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
			}
		});
		
		
		JButton jbJColorChooser=new JButton("Abrir JColorChooser");
		jbJColorChooser.addActionListener(e -> { {
				// TODO Auto-generated method stub
				Color colorSeleccionado=JColorChooser.showDialog(jfPrincipal, "Selección de color", Color.RED);
				jfPrincipal.getContentPane().setBackground(colorSeleccionado);
			}
		});
		
		

		
		jfPrincipal.getContentPane().add(jbJFrame);
		jfPrincipal.getContentPane().add(jbJDialog);
		jfPrincipal.getContentPane().add(jbJOptionPane);
		jfPrincipal.getContentPane().add(jbJFileChooser);
		jfPrincipal.getContentPane().add(jbJColorChooser);
		jfPrincipal.getContentPane().add(jspTexto);

		
		jfPrincipal.setVisible(true);
		

	}

}
