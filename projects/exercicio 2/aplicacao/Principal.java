package aplicacao;

import fabricas.FabricaTrem;
import fabricas.FabricaTremEletrico;
import fabricas.FabricaTremDiesel;

public class Principal {
    public static void main(String[] args) {

        String tipoTrem = "Diesel";
        FabricaTrem fabrica = null;
        System.out.println(tipoTrem);

        if (tipoTrem.equals("Diesel")) {
            fabrica = new FabricaTremDiesel();
        } else {
            if (tipoTrem.equals("Eletrico")) {
                fabrica = new FabricaTremEletrico();
            } else {
                System.err.println("Tipo inválido");
                throw new Error("Tipo inválido");
            }
        }

        LinhaFerrea app = new LinhaFerrea(fabrica);
        app.criaFerrovia();
    }
}
