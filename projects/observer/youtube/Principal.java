package youtube;

import youtube.Criador;

public class Principal {

    public static void main(String[] args) {
        Criador felipeNeto = new Criador();

        felipeNeto.inscrever(new Consumidor("Enzo 1"));
        felipeNeto.inscrever(new Consumidor("Enzo 2"));
        felipeNeto.inscrever(new Consumidor("Enzo 3"));
        felipeNeto.inscrever(new Consumidor("Enzo 4"));
        felipeNeto.inscrever(new Consumidor("Valentina 1"));
        felipeNeto.inscrever(new Consumidor("Valentina 2"));

        felipeNeto.listarInscritos();

        System.out.println();

        felipeNeto.notificarTodos();
    }
}
