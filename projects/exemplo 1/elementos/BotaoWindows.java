package elementos;

public class BotaoWindows extends Botao {

    public BotaoWindows() {
        colorir();
    }

    @Override
    public void colorir() {
        super.setCor("azul");
        System.out.println("Cor atual do botão " + super.getCor());
    }
}
