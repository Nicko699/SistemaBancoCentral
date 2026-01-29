package BancoCentral;
//clase abstracta cuenta
public abstract class Cuenta {

    double saldo;
//
    public abstract void retirarSaldo(double monto);

    public abstract void depositarSaldo(double monto);

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
