package cl.alkeWallet.entidades.menu;

import cl.alkeWallet.entidades.cuenta.Transaccion;
import cl.alkeWallet.entidades.usuario.GestorUsuario;
import cl.alkeWallet.entidades.cuenta.Cuenta;

import java.util.Scanner;

/**
 * Clase que gestiona el menú de operaciones de cuenta en AlkeWallet.
 * Aquí se manejan las acciones relacionadas con la cuenta del usuario.
 */
public class MenuCuenta extends Menu {
    /**
     *  Captura la entrada del usuario
     */
    private final Scanner scanner;
    /**
     * se crea objeto cuenta
     */
    Cuenta cuenta = new Cuenta();
    /**
     * se crea objeto transaccion;
     */
    Transaccion transaccion = new Transaccion();

    /**
     * Constructor que recibe un gestor de usuarios.
     *
     * @param gestorUsuario El gestor de usuarios para las operaciones de cuenta.
     */
    public MenuCuenta(GestorUsuario gestorUsuario) {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Muestra el menú de cuenta y procesa la opción seleccionada por el usuario.
     * Permite depositar, ver saldo, debitar saldo, convertir moneda y salir.
     */
    public void mostrar() {
        boolean ciclo = true;
        while (ciclo) {
            System.out.println("**** AlkeWallet - Menú de Cuenta ****\n");
            System.out.println("""
                    1 - Depositar Saldo
                    2 - Ver Saldo
                    3 - Debitar Saldo
                    4 - Convertir a Dolar
                    5 - Convertir a Euro
                    6 - Salir\s""");
            System.out.println("*** Ingrese una Opción: ***");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    cuenta.depositar();
                    break;
                case 2:
                    cuenta.verSaldo();
                    break;
                case 3:
                    cuenta.debitar();
                    break;
                case 4:
                    transaccion.convertirdolar();
                    break;
                case 5:
                    transaccion.convertirEuro();
                    break;
                case 6:
                    System.out.println(" CERRANDO MENU DE CUENTA  ");
                    ciclo = false;
                    break;
                default:
                    System.out.println(" OPCION INCORRECTA ");
                    break;
            }
        }
    }
}