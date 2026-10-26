import eric.estudos.ValidadorSenha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void senhaComOitoCaracteresEhValida() {
        // Arrange
        var validador = new ValidadorSenha();

        // Act
        boolean senhaEhValida = validador.validar("Abcde123");

        // Assert
        assertTrue(senhaEhValida);
    }

    @Test
    void senhaComDezCaracteresEhValida() {
        // Arrange
        var validador = new ValidadorSenha();

        // Act
        boolean senhaEhValida = validador.validar("Abcdefg123");

        // Assert
        assertTrue(senhaEhValida);
    }

    @Test
    void senhaVaziaEhInvalida() {
        // Arrange
        var validador = new ValidadorSenha();

        // Act
        boolean senhaEhValida = validador.validar("");

        // Assert
        assertFalse(senhaEhValida);
    }

    @Test
    void senhaComMaisDe256CaracteresEhInvalida() {
        // Arrange
        var validador = new ValidadorSenha();
        String senha = "111A" + "a".repeat(256);

        // Act
        boolean senhaEhValida = validador.validar(senha);

        // Assert
        assertFalse(senhaEhValida);
    }

    @Test
    void senhaSemMaiusculaEhInvalida() {
        // Arrange
        var validador = new ValidadorSenha();

        // Act
        boolean senhaEhValida = validador.validar("123456789a");

        // Assert
        assertFalse(senhaEhValida);
    }

    @Test
    void senhaSemDigitoEhInvalida() {
        // Arrange
        var validador = new ValidadorSenha();

        // Act
        boolean senhaEhValida = validador.validar("ABcdefghij");

        // Assert
        assertFalse(senhaEhValida);
    }

}
