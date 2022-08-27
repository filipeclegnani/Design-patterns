package elementos;

public class CheckBoxWindows extends CheckBox {

    public CheckBoxWindows() {
        colorir();
    }

    @Override
    public void colorir() {
        // TODO Auto-generated method stub

        super.setCor("azul");
        System.out.println("Cor atual do check box " + super.getCor());
    }

}
