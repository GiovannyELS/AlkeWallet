package cl.alkeWallet.entidades.cuenta;

import java.util.Scanner;

/**
 * Clase Transaccion que maneja las operaciones de cambio de moneda.
 * Permite al usuario convertir montos de pesos chilenos a dólares y euros.
 */
public class Transaccion {
    protected double montoCLP; // Monto en pesos chilenos a convertir
    protected final double divisaDolar = 980; // Valor de conversión a dólares
    protected final double divisaEuro = 1002; // Valor de conversión a euros

    /**
     * Convierte un monto en pesos chilenos a dólares.
     * Solicita al usuario ingresar el monto en CLP y muestra el resultado de la conversión.
     * @return El valor convertido a dólares.
     */
    public double convertirdolar () {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de pesos chilenos a cambiar: ");
        this.montoCLP = scanner.nextDouble();
        double valor = this.divisaDolar * montoCLP / 1000;
        System.out.println("La cantidad de CLP a Dolar serian: " + valor);
        return valor;
    }

    /**
     * Convierte un monto en pesos chilenos a euros.
     * Solicita al usuario ingresar el monto en CLP y muestra el resultado de la conversión.
     * @return El valor convertido a euros.
     */
    public double convertirEuro () {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de pesos chilenos a cambiar: ");
        this.montoCLP = scanner.nextDouble();
        double valor = this.divisaEuro * montoCLP / 1000;
        System.out.println("La cantidad de divisas a Euro serian: " + valor);
        return valor;
    }
}
