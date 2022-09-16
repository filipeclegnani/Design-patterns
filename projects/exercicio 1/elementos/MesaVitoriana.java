package elementos;

public class MesaVitoriana extends Mesa {

    public MesaVitoriana() {
        construir();
    }

    @Override
    public void construir() {
        // TODO Auto-generated method stub
        super.setMaterial("madeira");
        System.out.println("material da mesa: " + super.getMaterial());
    }

}
