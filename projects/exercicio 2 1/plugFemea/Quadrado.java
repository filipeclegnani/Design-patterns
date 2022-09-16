package plugFemea;

import plugMacho.QuadradoMacho;

public class Quadrado {
    private double altura;
    private double largura;
    private QuadradoMacho macho;

    public Quadrado(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Quadrado() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public QuadradoMacho getMacho() {
        return macho;
    }

    public void setMacho(QuadradoMacho macho) {
        this.macho = macho;
    }

    public double getArea() {
        return this.altura * this.largura;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Qaudrado femea de altura:" + this.altura + " e largura: " + this.largura;
    }
}
