

import controlador.ControladorCalculadoraSwing;
import modelo.Calculadora;
import vista.VistaCalculadoraSwing;


public class MainSwing {
    public static void main(String[] args) {
        Calculadora modelo = new Calculadora();
        VistaCalculadoraSwing vista = new VistaCalculadoraSwing();
        ControladorCalculadoraSwing controlador = new ControladorCalculadoraSwing(modelo, vista);
        
     //   vista.setControlador(controlador);
        vista.setVisible(true);
    }
}

