package fabricas;

import elementos.Mesa;
import elementos.Sofa;

public interface FabricaDecoracao {
    public Sofa criaSofa();

    public Mesa criaMesa();
}
