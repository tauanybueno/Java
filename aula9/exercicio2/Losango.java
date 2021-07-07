public class Losango extends Quadrilatero{

    public Losango(String nome, double ladoMaior, double ladoMenor) {
        super(nome, ladoMaior, ladoMenor);
    }

    @Override
    public double calcularArea() {
        return (lado1 * lado2) / 2;
    }
}
