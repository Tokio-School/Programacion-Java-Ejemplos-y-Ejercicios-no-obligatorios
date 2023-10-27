package Ejem04_ClasesAbstractas;

abstract class CuentaBancaria {
    private String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public abstract void retirar(double cantidad);
    public abstract void generarInforme();
}

class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(String titular, double saldoInicial, double tasaInteres) {
        super(titular, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    @Override
    public void generarInforme() {
        System.out.println("Cuenta de Ahorro de " + titular + " - Saldo: $" + saldo);
    }
}

class CuentaCorriente extends CuentaBancaria {
    private double sobregiro;

    public CuentaCorriente(String titular, double saldoInicial, double sobregiro) {
        super(titular, saldoInicial);
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo + sobregiro) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public void generarInforme() {
        System.out.println("Cuenta Corriente de " + titular + " - Saldo: $" + saldo);
    }
}

