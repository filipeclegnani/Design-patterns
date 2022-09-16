package fabricas;

import elementos.Mesa;
import elementos.MesaVitoriana;
import elementos.Sofa;
import elementos.SofaVitoriano;

public class FabricaDecoracaoVitoriana implements FabricaDecoracao {

    @Override
    public Sofa criaSofa() {
        // TODO Auto-generated method stub
        return new SofaVitoriano();
    }

    @Override
    public Mesa criaMesa() {
        // TODO Auto-generated method stub
        return new MesaVitoriana();
    }

}
