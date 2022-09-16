package elementos;

public class SofaModerno extends Sofa {

    public SofaModerno() {
        colorir();
    }

    @Override
    public void colorir() {
        super.setCor("verde");
        System.out.println("Cor atual do sofá " + super.getCor());

    }

}
