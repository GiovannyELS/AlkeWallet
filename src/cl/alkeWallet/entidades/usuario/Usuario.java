package cl.alkeWallet.entidades.usuario;

/**
 * Clase Usuario que almacena la información de los usuarios de AlkeWallet.
 * Contiene construcutores, getters and setter para obtener y establecer el nombre de usuario y la contraseña.
 */
public class Usuario {
    /**
     * Nombre de usuario para el acceso a AlkeWallet
     */
    private String nombreUsuario;
    /**
     * Contraseña para la seguridad del usuario
     */
    private String contrasenia;

    /**
     * Constructor por defecto de Usuario.
     * Inicializa un usuario sin nombre ni contraseña.
     */
    public Usuario() {
        this.nombreUsuario = getNombreUsuario();
        this.contrasenia = "";
    }

    /**
     * Constructor de Usuario con nombre de usuario y contraseña.
     * @param nombreUsuario El nombre de usuario del nuevo Usuario.
     * @param contrasenia La contraseña del nuevo Usuario.
     */
    public Usuario(String nombreUsuario, String contrasenia) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    /**
     * Obtiene el nombre de usuario.
     * @return El nombre de usuario actual.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece un nuevo nombre de usuario.
     * @param nombreUsuario El nuevo nombre de usuario a establecer.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña actual del usuario.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece una nueva contraseña para el usuario.
     * @param contrasenia La nueva contraseña a establecer.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
