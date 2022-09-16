package aplicacao;

import adapters.QuadradoAdapter;
import adapters.RedondoAdapter;
import plugFemea.Quadrado;
import plugFemea.Redondo;
import plugMacho.QuadradoMacho;
import plugMacho.RedondoMacho;

public class Aplicacao {
    public static void main(String[] arg) {
        QuadradoMacho qMacho = new QuadradoMacho(5, 1);
        Redondo rFemea = new Redondo(1);

        System.out.println(qMacho);
        System.out.println(rFemea);

        QuadradoAdapter quadradoMredondoF = new QuadradoAdapter(qMacho, rFemea);

        System.out.println(quadradoMredondoF);
        System.out.println("area: " + quadradoMredondoF.getArea());

        System.out.println("\n----------------------------\n");

        RedondoMacho rMacho = new RedondoMacho(1);
        Quadrado qFemea = new Quadrado(5, 1);

        System.out.println(rMacho);
        System.out.println(qFemea);

        RedondoAdapter redondoMquadradoF = new RedondoAdapter(rMacho, qFemea);

        System.out.println(redondoMquadradoF);
        System.out.println("area: " + redondoMquadradoF.getArea());
    }
}
