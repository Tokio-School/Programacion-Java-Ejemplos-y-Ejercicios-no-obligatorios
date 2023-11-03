package ejem02_losbasicos;

public class EjemploMath {
    public static void main(String[] args) {
        // Elevar un número a una potencia
        double base = 2.0;
        double exponente = 3.0;
        double resultado = Math.pow(base, exponente);
        System.out.println("2^3 = " + resultado);

        // Calcular la raíz cuadrada
        double numero = 25.0;
        double raiz = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de 25 es " + raiz);

        // Redondear un número
        double decimal = 5.67;
        long redondeado = Math.round(decimal);
        System.out.println("Redondeado: " + redondeado);

        // Valor absoluto
        int negativo = -10;
        int absoluto = Math.abs(negativo);
        System.out.println("Valor absoluto de -10 es " + absoluto);

        // Encontrar el máximo y el mínimo de dos números
        int a = 30;
        int b = 20;
        int maximo = Math.max(a, b);
        int minimo = Math.min(a, b);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}

