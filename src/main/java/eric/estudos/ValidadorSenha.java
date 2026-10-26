package eric.estudos;

public class ValidadorSenha {

    public boolean validar(String s) {
        if (s == null || s.length() < 8) return false;
        if (s.length() > 256) return false;
        boolean digito = s.chars().anyMatch(Character::isDigit);
        boolean maiuscula = s.chars().anyMatch(Character::isUpperCase);
        return digito && maiuscula;
    }

}
