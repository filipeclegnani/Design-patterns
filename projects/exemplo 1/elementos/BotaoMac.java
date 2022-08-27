package elementos;

public class BotaoMac extends Botao {

    public BotaoMac() {
        colorir();
    }

    @Override
    public void colorir() {
        super.setCor("vermelho");
        System.out.println("Cor atual do botão " + super.getCor());
    }

}
