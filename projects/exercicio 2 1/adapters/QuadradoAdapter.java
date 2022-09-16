package adapters;

import plugFemea.Redondo;
import plugMacho.QuadradoMacho;

public class QuadradoAdapter extends Redondo {
    private QuadradoMacho quadrado;

    public QuadradoAdapter(QuadradoMacho quadrado, Redondo redondo) {
        super.setRaio(redondo.getRaio());
        this.quadrado = quadrado;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return quadrado.getArea();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Adaptado quadrado macho\n\t" + quadrado.toString() + "\nPara circulo femea\n\t" + super.toString();
    }

}
