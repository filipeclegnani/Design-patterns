package elementos;

public abstract class Sofa {
    private String cor;

    public abstract void colorir();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
