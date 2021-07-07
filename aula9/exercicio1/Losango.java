public class Losango extends FiguraGeometrica{

    private double d;
    private double D;

    public Losango (String nome, double d, double D){
        super(nome);
        this.d = d;
        this.D = D;
    }

    @Override
    public double calcularArea() {
        return (D * d) / 2;
    }
}
