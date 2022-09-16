package elementos;

public abstract class Locomotiva {
    private Number potencia;

    public abstract void potencializar();

    public Number getPotencia() {
        return potencia;
    }

    public void setPotencia(Number potencia) {
        this.potencia = potencia;
    }

}
