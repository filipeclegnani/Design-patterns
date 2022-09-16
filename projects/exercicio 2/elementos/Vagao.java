package elementos;

public abstract class Vagao {

    private String material;

    public abstract void construir();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
