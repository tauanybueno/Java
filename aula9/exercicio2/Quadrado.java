public class Quadrado extends Quadrilatero{

    public Quadrado(String nome, double lado) {
        super(nome, lado, lado);
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

}
