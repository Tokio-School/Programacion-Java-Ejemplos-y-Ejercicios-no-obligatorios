import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Aplicacion {

	public static void main(String[] args) {
		// Creación de la ventana
		JFrame frame = new JFrame("Aplicacion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocation(100, 100);
		frame.setTitle("Mi primera aplicación en Swing");
		
		// Creación de la distribución de la ventana
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		// Creando componentes
		JLabel jl_nombre = new JLabel("Nombre:");
		JTextField jtf_nombre = new JTextField(20);
		JButton jb_saludar= new JButton("Hola");
		JButton jb_despedir= new JButton("Adios");
		

		frame.getContentPane().add(jl_nombre);
		frame.getContentPane().add(jtf_nombre);
		frame.getContentPane().add(jb_saludar);
		frame.getContentPane().add(jb_despedir);
		
		/*jb_saludar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hola mundo");
			}
			
		});*/
		
		ActionListener gestorEventos= (ActionEvent pulsacionBoton) -> 
		{
			//((JButton) pulsacionBoton.getSource()).setText(jtf_nombre.getText());
			switch(((JButton) pulsacionBoton.getSource()).getText())
            {
				case "Hola":
					System.out.println("Hola mundo");
					break;
				case "Adios":
					System.out.println("Adios mundo");
					break;
			
            }
		};
		
		jb_saludar.addActionListener(gestorEventos);
		jb_despedir.addActionListener(gestorEventos);
		
		
		JButton jb_anadirCiudad=new JButton("Añadir ciudad");
		JComboBox<String> jcb_ciudades= new JComboBox<String>();
		frame.getContentPane().add(jb_anadirCiudad);
		jb_anadirCiudad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jcb_ciudades.addItem(jtf_nombre.getText());
				System.out.println("Añado al desplegable una ciudad teniendo éste seleccionada "+jcb_ciudades.getSelectedItem());
			}

		});
		
		
		jcb_ciudades.addItem("Madrid");
		jcb_ciudades.addItem("Barcelona");
		jcb_ciudades.addItem("Sevilla");
		jcb_ciudades.addItem("Valencia");
		jcb_ciudades.setSelectedIndex(3);
		frame.getContentPane().add(jcb_ciudades);
		
		
		
		//JCheckBox
		JCheckBox jcb_activarBotonCiudad=new JCheckBox("Activar boton ciudad");
		frame.getContentPane().add(jcb_activarBotonCiudad);
		jcb_activarBotonCiudad.addActionListener(e->{
			jb_anadirCiudad.setEnabled(jcb_activarBotonCiudad.isSelected());
		});
		
		
		
		
		frame.setVisible(true);
		
		
		
	}

}
