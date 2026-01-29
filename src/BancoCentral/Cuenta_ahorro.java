package BancoCentral;

import java.util.Scanner;

//cuenta ahorro
public class Cuenta_ahorro extends Cuenta {

    public Cuenta_ahorro() {
    }

    public Cuenta_ahorro(double saldo) {
        super(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//metodo para retirar saldo
    @Override
    public void retirarSaldo(double monto) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            try {
                //condicion para retirar saldo minimo 500
                if (saldo >= 500) {
                    //condicion para que no se retire mas del saldo disponible
                    saldo -= monto;
                    System.out.println("Retiro de saldo exitoso.Tu nuevo saldo es:" + saldo);
                    //si no hay saldo suficiente, muestra mensaje alerta
                } else {
                    System.out.println("Saldo insufuciente para retirar");

                }
                break;
         //capturamos el error si no se ingresa un numero
            } catch (Exception e) {
                System.out.println("¡ADVERTENCIA!.Solo Numeros");
                teclado.nextLine();
            }
        }

    }
//metodo para depositar saldo
    @Override
    public void depositarSaldo(double monto) {
        boolean primer_deposito = true;
        Scanner teclado = new Scanner(System.in);
        while (true) {
            try {
                //condicion para el primer deposito minimo de 1000
                if (primer_deposito) {
                   //si el monto es mayor o igual a 1000, se realiza el deposito
                    if (monto >= 1000) {
                        saldo += monto;
                        System.out.println("Deposito de saldo exitoso.Tu nuevo saldo es:" + saldo);
                        primer_deposito = false;
                   //si el monto es menor a 1000, muestra mensaje de alerta
                    } else {
                        System.out.println("Dinero a depositar insuficiente.Minimo 1000");

                    }
                    //para los siguientes depositos no hay monto minimo
                } else {
                    saldo += monto;
                    System.out.println("Deposito de saldo exitoso.Tu nuevo saldo es:" + saldo);
                }
                break;
                //capturamos el error si no se ingresa un numero
            } catch (Exception e) {
                System.out.println("¡ADVERTENCIA!.Solo Numeros");
                teclado.nextLine();

            }
        }
    }
    //metodo para obtener saldo
    public double obtenerSaldo() {

        return saldo;

    }

}
