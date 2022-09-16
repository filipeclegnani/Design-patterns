package chain_of_responsability;

public class Servidor {
    private String email;
    private String senha;

    public Servidor(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String conecta() {
        if (Valida.validaSenha(this.email, this.senha)) {
            return "conectado";
        }
        return "Falha ao conectar, verifique o e-mail e a senha";
    }

}
