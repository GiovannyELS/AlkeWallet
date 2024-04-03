package cl.alkeWallet.entidades.cuenta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {


    @Test
    void verSaldo() {
        Cuenta cuenta = new Cuenta();
        cuenta.verSaldo();
        assertEquals(0, cuenta.verSaldo(), "El saldo mostrado no es correcto.");
    }

}