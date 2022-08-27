package fabricas;

import elementos.Botao;
import elementos.CheckBox;

public interface FabricaUI {
    public Botao criarBotao();

    public CheckBox criarCheckbox();
}
