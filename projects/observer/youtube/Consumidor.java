package youtube;

public class Consumidor {
    private String nome;

    public Consumidor(String nome) {
        this.nome = nome;
    }

    public void notificar() {
        System.out.println(this.nome + " notificado");
    }

    @Override
    public String toString() {
        return "Consumidor: " + this.nome;
    }

}
