package eric.estudos;

public class Main {
    public static void main(String[] args) {

        ValidadorSenha validadorSenha = new ValidadorSenha();

        String novaSenha = "senha";

        boolean senhaEhValida = validadorSenha.validar(novaSenha);

        System.out.println(senhaEhValida);
    }
}