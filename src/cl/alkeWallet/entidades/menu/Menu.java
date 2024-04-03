package cl.alkeWallet.entidades.menu;
import java.util.Scanner;

/**
 * Clase abstracta Menú que representa la estructura básica de un menú en la aplicación.
 * Esta clase proporciona el molde para crear diferentes tipos de menús en el programa.
 */
public abstract class Menu {
    /**
     * Scanner utilizado para capturar la entrada del usuario.
     */
    protected Scanner scanner; // Scanner para leer la entrada del usuario

    /**
     * Constructor que inicializa el scanner utilizado para capturar la entrada del usuario.
     */
    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Método abstracto para mostrar las opciones del menú.
     * Las clases que hereden de Menu deben implementar este método can la acción específica de cada menú.
     */
    public abstract void mostrar();
}