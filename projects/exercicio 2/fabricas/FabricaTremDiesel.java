package fabricas;

import elementos.Vagao;
import elementos.VagaoCarga;
import elementos.Locomotiva;
import elementos.LocomotivaDiesel;

public class FabricaTremDiesel implements FabricaTrem {

    @Override
    public Locomotiva criaLocomotiva() {
        // TODO Auto-generated method stub
        return new LocomotivaDiesel();
    }

    @Override
    public Vagao criaVagao() {
        // TODO Auto-generated method stub
        return new VagaoCarga();
    }

}
