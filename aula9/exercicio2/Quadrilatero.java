public class Quadrilatero extends FiguraGeometrica{

    protected double lado1;
    protected double lado2;

    public Quadrilatero(String nome, double lado1, double lado2) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
