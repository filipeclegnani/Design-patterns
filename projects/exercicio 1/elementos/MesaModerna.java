package elementos;

public class MesaModerna extends Mesa {

    public MesaModerna() {
        construir();
    }

    @Override
    public void construir() {
        // TODO Auto-generated method stub
        super.setMaterial("plástico");
        System.out.println("material da mesa: " + super.getMaterial());
    }

}
