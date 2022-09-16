package plugFemea;

import plugMacho.RedondoMacho;

public class Redondo {
    private double raio;
    private RedondoMacho macho;

    public Redondo(double raio) {
        this.raio = raio;
    }

    public Redondo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public RedondoMacho getMacho() {
        return macho;
    }

    public void setMacho(RedondoMacho macho) {
        this.macho = macho;
    }

    public double getArea() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Circulo de raio: " + this.raio;
    }
}
