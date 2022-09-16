package aplicacao;

import fabricas.FabricaDecoracao;
import fabricas.FabricaDecoracaoModerna;
import fabricas.FabricaDecoracaoVitoriana;

public class Principal {
    public static void main(String[] args) {

        String estiloDaSala = "Vitoriana";
        FabricaDecoracao fabrica = null;

        if (estiloDaSala.equals("Moderna")) {
            fabrica = new FabricaDecoracaoModerna();
        } else {
            if (estiloDaSala.equals("Vitoriana")) {
                fabrica = new FabricaDecoracaoVitoriana();
            } else {
                System.err.println("Sistema operacional inválido");
                throw new Error("Sistema operacional inválido");
            }
        }

        Sala app = new Sala(fabrica);
        app.criaSala();
    }
}
