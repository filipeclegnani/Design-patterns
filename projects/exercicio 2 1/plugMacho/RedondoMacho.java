package plugMacho;

public class RedondoMacho {
    private double raio;

    public RedondoMacho() {
    }

    public RedondoMacho(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Redondo macho de raio: " + this.raio;
    }
}
