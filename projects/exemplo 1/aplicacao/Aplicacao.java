package aplicacao;

import elementos.Botao;
import elementos.CheckBox;
import fabricas.FabricaUI;

public class Aplicacao {
    FabricaUI fabricaUI;
    Botao botao;
    CheckBox checkBox;
    public Aplicacao(FabricaUI fabricaUI) {
        this.fabricaUI = fabricaUI;
    }

    public void criarUI(){
        this.botao = fabricaUI.criarBotao();
        this.checkBox = fabricaUI.criarCheckbox();
    }
}
