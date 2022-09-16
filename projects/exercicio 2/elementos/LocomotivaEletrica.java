package elementos;

public class LocomotivaEletrica extends Locomotiva {

    public LocomotivaEletrica() {
        potencializar();
    }

    @Override
    public void potencializar() {
        super.setPotencia(3000);
        System.out.println("Potência atual da locomotiva " + super.getPotencia());

    }

}
