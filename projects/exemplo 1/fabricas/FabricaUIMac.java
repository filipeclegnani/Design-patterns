package fabricas;

import elementos.Botao;
import elementos.BotaoMac;
import elementos.CheckBox;
import elementos.CheckBoxMac;

public class FabricaUIMac implements FabricaUI{

    @Override
    public Botao criarBotao() {
        // TODO Auto-generated method stub
        return new BotaoMac();
    }

    @Override
    public CheckBox criarCheckbox() {
        // TODO Auto-generated method stub
        return new CheckBoxMac();
    }
    
}
