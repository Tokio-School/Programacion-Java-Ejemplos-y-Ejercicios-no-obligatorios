package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Calculadora;
import vista.VistaCalculadoraSwing;

import javax.swing.AbstractButton;
import javax.swing.JButton;

public class ControladorCalculadoraSwing implements ActionListener {
    private Calculadora modelo;
    private VistaCalculadoraSwing vista;
    
    public ControladorCalculadoraSwing(Calculadora modelo, VistaCalculadoraSwing vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
        
        AbstractButton botones[]= vista.getBotones();
        System.out.println(botones.length);
		for (int i = 0; i < botones.length; i++) {
			System.out.println(i+"-"+botones[i]);
			((JButton)(botones[i])).addActionListener(this);
		}
    }
    
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == vista.getBtn0() || e.getSource() == vista.getBtn1() || e.getSource() == vista.getBtn2() || e.getSource() == vista.getBtn3() || e.getSource() == vista.getBtn4() || e.getSource() == vista.getBtn5() || e.getSource() == vista.getBtn6() || e.getSource() == vista.getBtn7() || e.getSource() == vista.getBtn8() || e.getSource() == vista.getBtn9() ) {
    		vista.actualizarResultado(vista.getTxtResultado().getText() + ((JButton)e.getSource()).getText());
    	}
    	
    	
        /*if(e.getSource() == vista.getBtn0()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "0");
        } else if(e.getSource() == vista.getBtn1()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "1");
        } else if(e.getSource() == vista.getBtn2()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "2");
        } else if(e.getSource() == vista.getBtn3()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "3");
        } else if(e.getSource() == vista.getBtn4()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "4");
        } else if(e.getSource() == vista.getBtn5()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "5");
        } else if(e.getSource() == vista.getBtn6()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "6");
        } else if(e.getSource() == vista.getBtn7()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "7");
        } else if(e.getSource() == vista.getBtn8()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "8");
        } else if(e.getSource() == vista.getBtn9()) {
            vista.actualizarResultado(vista.getTxtResultado().getText() + "9");
        } else*/ if(e.getSource() == vista.getBtnSuma()) {
            modelo.setOperando1(Double.parseDouble(vista.getTxtResultado().getText()));
            modelo.setOperador('+');
            vista.actualizarResultado("");
        } else if(e.getSource() == vista.getBtnResta()) {
            modelo.setOperando1(Double.parseDouble(vista.getTxtResultado().getText()));
            modelo.setOperador('-');
            vista.actualizarResultado("");
        } else if(e.getSource() == vista.getBtnMultiplicacion()) {
            modelo.setOperando1(Double.parseDouble(vista.getTxtResultado().getText()));
            modelo.setOperador('*');
            vista.actualizarResultado("");
        } else if(e.getSource() == vista.getBtnDivision()) {
            modelo.setOperando1(Double.parseDouble(vista.getTxtResultado().getText()));
            modelo.setOperador('/');
            vista.actualizarResultado("");
        } else if(e.getSource() == vista.getBtnIgual()) {
        	modelo.setOperando2(Double.parseDouble(vista.getTxtResultado().getText()));
            double resultado = modelo.calcular();
            vista.actualizarResultado(Double.toString(resultado));
        } else if(e.getSource() == vista.getBtnLimpiar()) {
            modelo.setOperando1(0);
            modelo.setOperando2(0);
            modelo.setOperador(' ');
            vista.actualizarResultado("");
        }
    }
}


