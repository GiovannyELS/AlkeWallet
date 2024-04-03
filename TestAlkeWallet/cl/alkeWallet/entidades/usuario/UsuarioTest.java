package cl.alkeWallet.entidades.usuario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UsuarioTest {

    @Test
    public void constructorWithParamsTest() {
        String nombreUsuario = "testUser";
        String contrasenia = "testPass";
        Usuario usuario = new Usuario(nombreUsuario, contrasenia);
        assertEquals(nombreUsuario, usuario.getNombreUsuario());
        assertEquals(contrasenia, usuario.getContrasenia());
    }

    @Test
    public void getNombreUsuarioTest() {
        String nombreUsuario = "testUser";
        Usuario usuario = new Usuario(nombreUsuario, "testPass");
        assertEquals(nombreUsuario, usuario.getNombreUsuario());
    }

    @Test
    public void setNombreUsuarioTest() {
        String nombreUsuario = "testUser";
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(nombreUsuario);
        assertEquals(nombreUsuario, usuario.getNombreUsuario());
    }

    @Test
    public void getContraseniaTest() {
        String contrasenia = "testPass";
        Usuario usuario = new Usuario("testUser", contrasenia);
        assertEquals(contrasenia, usuario.getContrasenia());
    }

    @Test
    public void setContraseniaTest() {
        String contrasenia = "testPass";
        Usuario usuario = new Usuario();
        usuario.setContrasenia(contrasenia);
        assertEquals(contrasenia, usuario.getContrasenia());}
}