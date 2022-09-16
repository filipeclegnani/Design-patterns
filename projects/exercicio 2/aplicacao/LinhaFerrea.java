package aplicacao;

import elementos.Vagao;
import elementos.Locomotiva;
import fabricas.FabricaTrem;

public class LinhaFerrea {
    FabricaTrem fabricaTrem;
    Vagao vagao;
    Locomotiva locomotiva;

    public LinhaFerrea(FabricaTrem fabricaDeco) {
        this.fabricaTrem = fabricaDeco;
    }

    public void criaFerrovia() {
        this.vagao = this.fabricaTrem.criaVagao();
        this.locomotiva = this.fabricaTrem.criaLocomotiva();
    }
}
