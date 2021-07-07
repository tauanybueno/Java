public class Conica extends FiguraGeometrica{

    protected double distancia1;
    protected double distancia2;

    public Conica(String nome, double distancia1, double distancia2) {
        super(nome);
        this.distancia1 = distancia1;
        this.distancia2 = distancia2;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
