package BancoCentral;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoCentral {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Ingreso_banco ingreso = new Ingreso_banco();
        Cuenta_ahorro ahorro = new Cuenta_ahorro();
        Cuenta_inversion inversion = new Cuenta_inversion();
        ingreso.ingresar_Nombre();
        ingreso.ingresar_Usuario();
        //mensaje de bienvenida
        System.out.println("BIENVENIDO AL BANCO CENTRAL");
        while (true) {
            //menu de opciones
            try {
                System.out.println("Seleccione una opcion");
                System.out.println("1.Cuenta Ahorro");
                System.out.println("2.Cuenta Inversion");
                System.out.println("3.Informacion Empleado");
                System.out.println("4.Salir");
                int acciones = teclado.nextInt();
                //menu de acciones
                switch (acciones) {
                    //opcion cuenta ahorro
                    case 1:
                        System.out.println("Seleccione una opcion");
                        System.out.println("1.Depositar");
                        System.out.println("2.Retirar");
                        System.out.println("3.Obtener Saldo");
                        System.out.println("4.Salir");
                        int acciones1 = teclado.nextInt();
                        //acciones cuenta ahorro
                        switch (acciones1) {
                            //depositar saldo
                            case 1:
                                System.out.println("Ingrese el valor a Depositar");
                                double monto_depositoAhorro = teclado.nextDouble();
                                ahorro.depositarSaldo(monto_depositoAhorro);
                                break;
                                //retirar saldo
                            case 2:
                                System.out.println("Ingrese el valor a Retirar");
                                double monto_retiroAhorro = teclado.nextDouble();
                                ahorro.retirarSaldo(monto_retiroAhorro);
                                break;
                                //obtener saldo
                            case 3:
                                System.out.println("Tu saldo actual es:" + ahorro.obtenerSaldo());
                                break;
                                //salir de la cuenta
                            case 4:
                                System.out.println("Saliendo de la Cuenta....");
                                System.exit(0);
                                break;
                                //opcion no valida
                            default:
                                System.out.println("Valor ingresado no valido");
                                break;
                        }
                        break;
                     //opcion de la cuenta inversion
                    case 2:

                        System.out.println("Seleccione una opcion");
                        System.out.println("1.Depositar");
                        System.out.println("2.Retirar");
                        System.out.println("3.Retirar todo");
                        System.out.println("4.Obtener Saldo");
                        System.out.println("5.Salir");
                        int acciones2 = teclado.nextInt();
                        //acciones cuenta inversion
                        switch (acciones2) {
                            //depositar saldo
                            case 1:
                                System.out.println("Ingrese el valor a Depositar");
                                double deposito_inversion = teclado.nextDouble();
                                inversion.depositarSaldo(deposito_inversion);
                                break;
                                //retirar saldo
                            case 2:
                                System.out.println("Ingrese el valor a Retirar");
                                double retiro_inversion = teclado.nextDouble();
                                inversion.retirarSaldo(retiro_inversion);
                                break;
                                //retirar todo el saldo
                            case 3:
                                inversion.retitarTodo(0);
                                break;
                                //obtener saldo
                            case 4:
                                System.out.println("El saldo actual es de:" + inversion.obtenerSaldo());
                                break;
                                //salir de la cuenta
                            case 5:
                                System.out.println("Saliendo de la Cuenta....");
                                System.exit(0);
                                break;
                                //opcion no valida
                            default:
                                System.out.println("Valor ingresado no valido");
                                break;
                        }

                        break;
                        //opcion informacion empleado
                    case 3:
                        List<Empleado> emp = new ArrayList<Empleado>();
                        emp.add(new Empleado(1, "Nick", "Supervisor", 1600000, 7, 2));
                        emp.add(new Empleado(2, "Juan", "Recepcionista", 1700000, 9, 3));
                        emp.add(new Empleado(3, "Alex", "Cajero", 2000000, 11, 4));
                        emp.add(new Empleado(4, "Rick", "Administrador", 2200000, 13, 5));
                        emp.add(new Empleado(5, "Luz", "Desarrolladora", 3000000, 9, 3));
                        emp.add(new Empleado(6, "Santi", "administrador BD", 2700000, 5, 1));
                        emp.add(new Empleado(7, "Maria", "Analista", 2900000, 7, 2));
                        //mostrar informacion de los empleados
                        for (Empleado em : emp) {
                            System.out.println(em.toString());

                        }
                        break;
                        //salir del banco
                    case 4:
                        System.out.println("Saliendo de la Cuenta...");
                        System.exit(0);
                        break;
                        //opcion no valida
                    default:
                        System.out.println("Valor ingresado no valido");

                }
//capturamos el error si no se ingresa un numero
            } catch (Exception e) {
                System.out.println("¡Solo se permiten numeros!");
                teclado.next();
            }
        }
    }

}
