package chain_of_responsability;

public class Valida {
    public static boolean validaSenha(String email, String senha) {
        BancoDeDados bd = new BancoDeDados();
        Usuario[] usuarios = bd.getUsuarios();

        for (int i = 0; i < usuarios.length; i++) {
            Usuario usuarioAtual = usuarios[i];
            if (usuarioAtual.email.equals(email) && usuarioAtual.senha.equals(senha)) {
                return true;
            }
        }

        return false;
    }
}
