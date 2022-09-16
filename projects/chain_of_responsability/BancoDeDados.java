package chain_of_responsability;

public class BancoDeDados {
    private Usuario[] usuarios = {
            new Usuario("email1@email.com", "email1"),
            new Usuario("email2@email.com", "email2"),
            new Usuario("email3@email.com", "email3"),
            new Usuario("email4@email.com", "email4"),
            new Usuario("email5@email.com", "email5"),
            new Usuario("email6@email.com", "email6"),
            new Usuario("email7@email.com", "email7"),
            new Usuario("email8@email.com", "email8"),
            new Usuario("email9@email.com", "email9"),
            new Usuario("email10@email.com", "email10"), };

    public BancoDeDados() {
    }

    public Usuario[] getUsuarios() {
        return this.usuarios;
    }

}
