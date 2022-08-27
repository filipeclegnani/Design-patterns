package fabricas;

import elementos.Botao;
import elementos.BotaoWindows;
import elementos.CheckBox;
import elementos.CheckBoxWindows;

public class FabricaUIWindows implements FabricaUI{

    @Override
    public Botao criarBotao() {
        // TODO Auto-generated method stub
        return new BotaoWindows();
    }

    @Override
    public CheckBox criarCheckbox() {
        // TODO Auto-generated method stub
        return new CheckBoxWindows();
    }
    
}
