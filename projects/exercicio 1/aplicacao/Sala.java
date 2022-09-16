package aplicacao;

import elementos.Mesa;
import elementos.Sofa;
import fabricas.FabricaDecoracao;

public class Sala {
    FabricaDecoracao fabricaDeco;
    Mesa mesa;
    Sofa sofa;

    public Sala(FabricaDecoracao fabricaDeco) {
        this.fabricaDeco = fabricaDeco;
    }

    public void criaSala() {
        this.mesa = this.fabricaDeco.criaMesa();
        this.sofa = this.fabricaDeco.criaSofa();
    }
}
