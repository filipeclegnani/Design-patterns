package elementos;

public class VagaoPassageiro extends Vagao {

    public VagaoPassageiro() {
        construir();
    }

    @Override
    public void construir() {
        // TODO Auto-generated method stub
        super.setMaterial("aço");
        System.out.println("material do vagão: " + super.getMaterial());
    }

}
