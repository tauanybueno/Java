public class Elipse extends FiguraGeometrica{

    private double a;
    private double b;

    public Elipse (String nome, double a, double b){
        super(nome);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcularArea() {
        return Math.PI * a * b;
    }
}
