package cl.alkeWallet.entidades.cuenta;

import java.util.Scanner;

/**
 * Clase Cuenta que gestiona el saldo y las transacciones de un usuario.
 * Permite realizar operaciones como depositar, ver saldo y debitar.
 */
public class Cuenta {

    /**
     * Atributo saldo de la cuenta
     */
    private double saldo;
    /**
     * Atributo cantidad a depositar o debitar
     */
    private double cantidad;

    /**
     * Constructor por defecto que inicializa la cuenta con saldo cero.
     */
    public Cuenta() {
        this.saldo = 0;
    }

    /**
     * Método para depositar una cantidad en la cuenta.
     * @return el saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para depositar una cantidad en la cuenta.
     * Solicita al usuario ingresar la cantidad y la añade al saldo si es positiva.
     */
    public void depositar() {
        System.out.print("Ingrese la cantidad a depositar: ");
        Scanner scanner = new Scanner(System.in);
        this.cantidad = scanner.nextDouble();
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado con éxito. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    /**
     * Método para ver el saldo actual de la cuenta.
     * Muestra el saldo actual al usuario.
     *
     * @return El saldo actual de la cuenta.
     */
    public double verSaldo() {
        System.out.println("Su Saldo actual es: " + this.saldo);
        return saldo;
    }

    /**
     * Método para debitar una cantidad de la cuenta.
     * Solicita al usuario ingresar la cantidad a retirar y la resta del saldo si es válida.
     *
     * @return verdadero si el debito es exitoso, falso en caso contrario.
     */
    public boolean debitar() {
        System.out.print("Ingrese la cantidad a retirar: ");
        Scanner scanner = new Scanner(System.in);
        this.cantidad = scanner.nextDouble();
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Debito realizado con éxito. Saldo actual: " + saldo);
            return true;
        } else {
            System.out.println("Cantidad a debitar inválida o fondos insuficientes.");
            return false;
        }
    }
}
