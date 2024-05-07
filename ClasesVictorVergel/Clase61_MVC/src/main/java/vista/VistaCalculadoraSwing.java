package vista;


import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorCalculadoraSwing;
import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/**
 * The Class VistaCalculadoraSwing.
 */
@Getter
@Setter
public class VistaCalculadoraSwing extends JFrame {
    
    /** The txt resultado. */
    private JTextField txtResultado;
    
    /** The btn 9. */
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    
    /** The btn limpiar. */
    private JButton btnSuma, btnResta, btnMultiplicacion, btnDivision, btnIgual, btnLimpiar;
    
    private AbstractButton botones[];
    
    /** The panel operadores. */
    private JPanel panelNumeros, panelOperadores;
    
    /**
     * Instantiates a new vista calculadora swing.
     */
    public VistaCalculadoraSwing() {
        super("Calculadora MVC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        txtResultado.setHorizontalAlignment(JTextField.RIGHT);
        add(txtResultado, "North");
        
        panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 3));
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnLimpiar = new JButton("C");
        panelNumeros.add(btn1);
        panelNumeros.add(btn2);
        panelNumeros.add(btn3);
        panelNumeros.add(btn4);
        panelNumeros.add(btn5);
        panelNumeros.add(btn6);
        panelNumeros.add(btn7);
        panelNumeros.add(btn8);
        panelNumeros.add(btn9);
        panelNumeros.add(btn0);
        panelNumeros.add(btnLimpiar);

        add(panelNumeros, "Center");
        
        panelOperadores = new JPanel();
        panelOperadores.setLayout(new GridLayout(4, 1));
        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMultiplicacion = new JButton("*");
        btnDivision = new JButton("/");
        btnIgual = new JButton("=");
        panelNumeros.add(btnIgual);
        panelOperadores.add(btnSuma);
        panelOperadores.add(btnResta);
        panelOperadores.add(btnMultiplicacion);
        panelOperadores.add(btnDivision);
        
        add(panelOperadores, "East");
        
        pack();
        
        botones=new AbstractButton[] {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSuma, btnResta, btnMultiplicacion, btnDivision, btnIgual, btnLimpiar};
        setLocationRelativeTo(null);
    }
    
    /**
     * Sets the controlador.
     *
     * @param controlador the new controlador
     */
    public void setControlador(ControladorCalculadoraSwing controlador) {
        btn0.addActionListener(controlador);
        btn1.addActionListener(controlador);
        btn2.addActionListener(controlador);
        btn3.addActionListener(controlador);
        btn4.addActionListener(controlador);
        btn5.addActionListener(controlador);
        btn6.addActionListener(controlador);
        btn7.addActionListener(controlador);
        btn8.addActionListener(controlador);
        btn9.addActionListener(controlador);
        btnSuma.addActionListener(controlador);
        btnResta.addActionListener(controlador);
        btnMultiplicacion.addActionListener(controlador);
        btnDivision.addActionListener(controlador);
        btnIgual.addActionListener(controlador);
        btnLimpiar.addActionListener(controlador);
    }
    
    /**
     * Actualizar resultado.
     *
     * @param resultado the resultado
     */
    public void actualizarResultado(String resultado) {
        txtResultado.setText(resultado);
    }
}


