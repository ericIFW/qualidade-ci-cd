import eric.estudos.ValidadorSenha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidadorSenhaTest {

    @Test
    void senhaComSeteCaracteresEhInvalida() {
        // Arrange
        var validador = new ValidadorSenha();

        // Act
        boolean senhaEhValida = validador.validar("Abcde12");

        // Assert
        assertFalse(senhaEhValida);
    }

}
