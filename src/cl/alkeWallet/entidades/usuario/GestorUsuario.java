package cl.alkeWallet.entidades.usuario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase que gestiona el usuario de AlkeWallet.
 * Permite registrar y verificar los datos usuario.
 */
public class GestorUsuario {

    /**
     * Map para almacenar los usuarios registrados.
     */
    private final Map<String, Usuario> usuarioRegistrado = new HashMap<>();
    Scanner scanner = new Scanner(System.in); // Para leer la entrada del usuario
    Usuario usuario = new Usuario(); // crea objeto de Usuario

    /**
     * Constructor por defecto de GestorUsuario.
     */
    public GestorUsuario() {
    }

    /**
     * Registra un nuevo usuario en el sistema.
     * @return true si el usuario es creado exitosamente, false si el nombre de usuario ya existe.
     */
    public boolean crearUsuario() {
        System.out.print("Ingrese su nombre de Usuario: ");
        String nombreUsuario = scanner.next();
        System.out.print("Ingrese su contraseña: ");
        String contrasenia = scanner.next();

        if (usuarioRegistrado.containsKey(nombreUsuario)) {
            System.out.println("El nombre de usuario ya está en uso. Por favor, elija otro.");
            return false;
        } else {
            Usuario nuevoUsuario = new Usuario(nombreUsuario, contrasenia);
            usuarioRegistrado.put(nombreUsuario, nuevoUsuario);
            System.out.println(" ----------------------------------- ");
            System.out.println("  - Usuario creado exitosamente -   ");
            System.out.println(" ----------------------------------- ");
            return true;
        }
    }

    /**
     * Verifica si las credenciales de un usuario son correctas.
     * @param nombreUsuario El nombre de usuario a verificar.
     * @param contrasenia La contraseña del usuario a verificar.
     * @return true si las credenciales son correctas, false en caso contrario.
     */
    public boolean verificarUsuario(String nombreUsuario, String contrasenia) {
        Usuario usuario = usuarioRegistrado.get(nombreUsuario);
        if (usuario != null && usuario.getContrasenia().equals(contrasenia)) {
            return true;
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            return false;
        }
    }
}
