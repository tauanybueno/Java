public class Circulo extends Conica{

    public Circulo (String nome, double raio){
       super(nome,raio, raio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * distancia1;
    }

}
