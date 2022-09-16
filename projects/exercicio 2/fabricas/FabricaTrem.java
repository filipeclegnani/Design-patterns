package fabricas;

import elementos.Vagao;
import elementos.Locomotiva;

public interface FabricaTrem {
    public Locomotiva criaLocomotiva();

    public Vagao criaVagao();
}
