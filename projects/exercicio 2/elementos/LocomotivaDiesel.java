package elementos;

public class LocomotivaDiesel extends Locomotiva {

    public LocomotivaDiesel() {
        potencializar();
    }

    @Override
    public void potencializar() {
        super.setPotencia(4920);
        System.out.println("Potência atual da locomotiva " + super.getPotencia());

    }

}
