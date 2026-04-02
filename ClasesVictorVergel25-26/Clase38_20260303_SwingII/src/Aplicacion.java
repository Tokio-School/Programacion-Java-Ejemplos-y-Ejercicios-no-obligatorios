import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class Aplicacion {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi primera ventana");
		ventana.setSize(600, 500);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		
		JPasswordField passwordField = new JPasswordField();
		ventana.add(new JLabel("Ingrese su contraseña:"));
		ventana.add(passwordField);
		/*passwordField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});*/
		passwordField.addActionListener((ActionEvent e)-> {
				String password = new String(passwordField.getPassword());
				System.out.println("Contraseña ingresada: " + password);
				passwordField.setText("");				
				System.out.println(((JPasswordField)e.getSource()).getPassword());
		});
		
		
		JCheckBox checkBox = new JCheckBox("Acepto los términos y condiciones");
		ventana.add(checkBox);
		checkBox.addItemListener((ItemEvent e)-> {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("Términos aceptados");
				} else {
					System.out.println("Términos no aceptados");
				}				
				System.out.println(((JCheckBox)e.getSource()).getText());
		});
		
		JRadioButton radioBaloncesto = new JRadioButton("Baloncesto");
		JRadioButton radioVoley = new JRadioButton("Voley");
		JRadioButton radioPingPong = new JRadioButton("Ping Pong");
		ButtonGroup grupoDeportes = new ButtonGroup();
		grupoDeportes.add(radioBaloncesto);
		grupoDeportes.add(radioVoley);
		grupoDeportes.add(radioPingPong);
		JPanel panelDeportes = new JPanel(new FlowLayout());
		ventana.add(new JLabel("Seleccione su deporte favorito:"));
		panelDeportes.add(radioBaloncesto);
		panelDeportes.add(radioVoley);
		panelDeportes.add(radioPingPong);
		ventana.add(panelDeportes);
		
		ActionListener radioListener= e ->
		{
			JRadioButton radio = (JRadioButton) e.getSource();
			if (radio.isSelected()) {
				System.out.println("Deporte seleccionado: " + radio.getText());
			}
		};
		radioBaloncesto.addActionListener(radioListener);
		radioVoley.addActionListener(radioListener);
		radioPingPong.addActionListener(radioListener);
		
		String[] opciones = {"Opción 1", "Opción 2", "Opción 3","Opción 4","Opción 5","Opción 6","Opción 7","Opción 8","Opción 9","Opción 10"};
		JList<String> listaOpciones = new JList<>(opciones);
		listaOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
		JScrollPane scrollPane = new JScrollPane(listaOpciones);
		scrollPane.setPreferredSize(new java.awt.Dimension(200, 100));
		
		ventana.add(new JLabel("Seleccione una opción:"));
		ventana.add(scrollPane);
		
		listaOpciones.addListSelectionListener(e ->
		{
			/*if (!e.getValueIsAdjusting()) {
				String opcionSeleccionada = listaOpciones.getSelectedValue();
				System.out.println("Opción seleccionada: " + opcionSeleccionada);
			}*/
			
			List<String> opcionesSeleccionadas = listaOpciones.getSelectedValuesList();
			System.out.println("Opciones seleccionadas: " + opcionesSeleccionadas);

		});
		
		
		JComboBox<String> comboBox = new JComboBox<>(opciones);
		comboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
		ventana.add(new JLabel("Seleccione una opción:"));
		ventana.add(comboBox);
		
		comboBox.addActionListener(e ->
		{
			String opcionSeleccionada = (String) comboBox.getSelectedItem();
			System.out.println("Opción seleccionada: " + opcionSeleccionada);
		});
		
		SpinnerNumberModel modeloSpinner = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinner = new JSpinner(modeloSpinner);
		spinner.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));
		spinner.setPreferredSize(new java.awt.Dimension(100, 30));
		spinner.addChangeListener(e ->
		{
			int valorSeleccionado = (int) spinner.getValue();
			System.out.println("Número seleccionado: " + valorSeleccionado);
		});
		 
		ventana.add(new JLabel("Seleccione un número:"));
		ventana.add(spinner);
		
		JSlider slider = new JSlider(0, 100, 50);
		slider.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(e ->
		{
			int valorSeleccionado = slider.getValue();
			System.out.println("Valor seleccionado: " + valorSeleccionado);
		});
		ventana.add(new JLabel("Seleccione un valor:"));
		ventana.add(slider);
		
		
		
		
		
		ventana.setMinimumSize(new java.awt.Dimension(400, 180));
		
		ventana.setVisible(true);

	}

}
