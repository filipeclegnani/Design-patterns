package adapters;

import plugFemea.Quadrado;
import plugMacho.RedondoMacho;

public class RedondoAdapter extends Quadrado {
    private RedondoMacho redondo;

    public RedondoAdapter(RedondoMacho redondo, Quadrado pino) {
        super.setAltura(pino.getAltura());
        super.setLargura(pino.getLargura());
        this.redondo = redondo;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return redondo.getArea();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Adaptado circulo macho\n\t" + redondo.toString() + "\nPara quadrado femea\n\t" + super.toString();
    }
}
