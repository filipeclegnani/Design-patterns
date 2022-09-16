package fabricas;

import elementos.Mesa;
import elementos.MesaModerna;
import elementos.Sofa;
import elementos.SofaModerno;

public class FabricaDecoracaoModerna implements FabricaDecoracao {

    @Override
    public Sofa criaSofa() {
        // TODO Auto-generated method stub
        return new SofaModerno();
    }

    @Override
    public Mesa criaMesa() {
        // TODO Auto-generated method stub
        return new MesaModerna();
    }

}
