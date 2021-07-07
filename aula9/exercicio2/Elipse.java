public class Elipse extends Conica{

    public Elipse(String nome, double distancia1, double distancia2) {
        super(nome, distancia1, distancia2);
    }

    @Override
    public double calcularArea() {
        return Math.PI * distancia1 * distancia2;
    }
}
