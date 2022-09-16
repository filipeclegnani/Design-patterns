package plugMacho;

public class QuadradoMacho {
    private double altura;
    private double largura;

    public QuadradoMacho() {
    }

    public QuadradoMacho(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getArea() {
        return this.altura * this.largura;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Quadrado mahco de altura: " + this.altura + " largura: " + this.largura;
    }
}
