package chain_of_responsability;

import java.util.Scanner;

public class Window {
    public static void main(String[] args) {
        /*
         * emails e senhas estão na classe BancoDeDados
         * exemplo
         * E-mail: email1@email.com
         * senha: email1
         */
        boolean conectado = false;
        Scanner ler = new Scanner(System.in);
        while (!conectado) {
            System.out.println("Digite o email");
            String email = ler.nextLine();
            System.out.println("Digite a senha");
            String senha = ler.nextLine();
            Servidor server = new Servidor(email, senha);
            System.out.println(server.conecta());
            if (server.conecta().equals("conectado")) {
                conectado = true;
            }
            System.out.println("Email: " + email + " Senha: " + senha);
        }
        ler.close();
    }
}
