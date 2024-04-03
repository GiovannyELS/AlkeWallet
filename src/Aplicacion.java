/**
 * Se presenta la primera versión del proyecto Alkewallet para el desarrollo de la aplicación, por ahora la aplicación está
 * pensada para el uso personal y manejo individual de un usuario. En próximas versiones se
 * verificaran detalles que puedan salir para mejoras continuas de la aplicación y se reevaluará si se modifican los requerimientos.
 */

import cl.alkeWallet.entidades.menu.MenuInicio;

/**
 * Clase principal de la aplicación AlkeWallet.
 * Esta clase contiene el método main que es el punto de entrada del programa.
 */
public class Aplicacion {
    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        /** Crea una instancia de MenuInicio y muestra el menú principal.*/

        MenuInicio menuInicio = new MenuInicio();

        /** Se llama al menú Inicio*/

        menuInicio.mostrar();
    }
}