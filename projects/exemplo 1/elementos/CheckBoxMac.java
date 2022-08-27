package elementos;

public class CheckBoxMac extends CheckBox {

    public CheckBoxMac() {
        colorir();
    }

    @Override
    public void colorir() {
        // TODO Auto-generated method stub
        super.setCor("vermelho");
        System.out.println("Cor atual do check box " + super.getCor());

    }

}
