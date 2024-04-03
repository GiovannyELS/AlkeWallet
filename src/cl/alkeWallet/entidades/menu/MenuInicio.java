package cl.alkeWallet.entidades.menu;
import cl.alkeWallet.entidades.cuenta.Cuenta;
import cl.alkeWallet.entidades.usuario.GestorUsuario;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase MenuInicio que extiende de la clase abstracta Menu.
 * Esta clase maneja la interfaz de usuario inicial de la aplicación AlkeWallet,
 * permitiendo al usuario crear una cuenta, ingresar o salir de la aplicación.
 */
public class MenuInicio extends Menu {

    /**
     * Atributo booleano que indica si el usuario debe salir de la aplicación.
     */
    boolean ciclo = true;
    /**
     * Gestiona las operaciones de usuario
     */
    GestorUsuario gestorUsuario = new GestorUsuario();
    /**
     * Scanner para leer la entrada del usuario
     */
    Scanner scanner = new Scanner(System.in);
    /**
     * Representa la cuenta del usuario
     */
    Cuenta cuenta = new Cuenta();

    /**
     * Método mostrar que presenta las opciones del menú principal y maneja la interacción del usuario.
     * Permite al usuario crear una cuenta, ingresar con una cuenta existente o salir de la aplicación.
     */
    public void mostrar() {
        while (ciclo) {
            // Opciones del menú
            System.out.println("**** AlkeWallet ****");
            System.out.println("""
                    1 - Crear Usuario
                    2 - Ingresar
                    3 - Salir\s""");
            System.out.println("*** Ingrese una Opción: ***");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        gestorUsuario.crearUsuario();
                        break;
                    case 2:
                        // Proceso de ingreso
                        System.out.print("Ingrese su nombre de usuario: ");
                        String nombreUsuario = scanner.nextLine();
                        System.out.print("Ingrese su contraseña: ");
                        String contrasenia = scanner.nextLine();

                        if (gestorUsuario.verificarUsuario(nombreUsuario, contrasenia)) {
                            cuenta.verSaldo();
                            MenuCuenta menuCuenta = new MenuCuenta(gestorUsuario);
                            menuCuenta.mostrar();
                        } else {
                            System.out.println("Nombre de usuario o contraseña incorrectos.");
                        }
                        break;
                    case 3:
                        // Falso para salir del bucle
                        System.out.println("*** Gracias por usar AlkeWallet ***");
                        ciclo = false;
                        break;
                    default:
                        System.out.println(" OPCION INCORRECTA ");
                        break;
                }
            } catch (InputMismatchException e) {
                // para las execepciones de entrada incorrectas.
                System.out.println(" POR FAVOR INGRESE LA OPCION CORRECTA ");
                scanner.next();
            }
        }
    }
}
