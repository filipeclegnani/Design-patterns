package fabricas;

import elementos.Vagao;
import elementos.VagaoPassageiro;
import elementos.Locomotiva;
import elementos.LocomotivaEletrica;

public class FabricaTremEletrico implements FabricaTrem {

    @Override
    public Locomotiva criaLocomotiva() {
        // TODO Auto-generated method stub
        return new LocomotivaEletrica();
    }

    @Override
    public Vagao criaVagao() {
        // TODO Auto-generated method stub
        return new VagaoPassageiro();
    }

}
