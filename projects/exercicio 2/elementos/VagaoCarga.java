package elementos;

public class VagaoCarga extends Vagao {

    public VagaoCarga() {
        construir();
    }

    @Override
    public void construir() {
        // TODO Auto-generated method stub
        super.setMaterial("madeira");
        System.out.println("material do vagão: " + super.getMaterial());
    }

}
