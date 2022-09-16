package youtube;

import java.util.ArrayList;

public class Criador {
    private ArrayList<Consumidor> inscritos = new ArrayList<Consumidor>();

    public Criador() {
    }

    public void inscrever(Consumidor conta) {
        this.inscritos.add(conta);
    }

    public void listarInscritos() {
        inscritos.forEach(item -> System.out.println(item));
    }

    public void notificarTodos() {
        inscritos.forEach(item -> item.notificar());
    }
}
