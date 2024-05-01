import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class AplicacionWindowBuilder {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField5;
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionWindowBuilder window = new AplicacionWindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AplicacionWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField1 = new JTextField();
		textField1.setText("1");
		frame.getContentPane().add(textField1, BorderLayout.NORTH);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setText("2");
		frame.getContentPane().add(textField2, BorderLayout.WEST);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setText("3");
		frame.getContentPane().add(textField3, BorderLayout.CENTER);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setText("4");
		frame.getContentPane().add(textField4, BorderLayout.EAST);
		textField4.setColumns(10);
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frame.getContentPane(), textField5, textField4, textField3, textField2, textField1}));
		
		textField5 = new JTextField();
		textField5.setText("5");
		frame.getContentPane().add(textField5, BorderLayout.SOUTH);
		textField5.setColumns(10);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textField5, textField4, textField3, textField2, textField1}));
		
		
		
	}

}
