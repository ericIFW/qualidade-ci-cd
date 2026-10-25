import eric.estudos.ValidadorSenha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidadorSenhaTest {

    @Test
    void senhaComSeteCaracteresEhInvalida() {
        var validador = new ValidadorSenha();
        assertFalse(validador.validar("Abcde12"));
    }

}
