package elementos;

public class SofaVitoriano extends Sofa {

    public SofaVitoriano() {
        colorir();
    }

    @Override
    public void colorir() {
        super.setCor("bordô");
        System.out.println("Cor atual do sofá " + super.getCor());

    }

}
