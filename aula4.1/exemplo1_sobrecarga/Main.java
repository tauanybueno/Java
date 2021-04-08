public class Main {
    public static void main(String[] agrs){

        //instanciar um objeto do tipo quadrado
        Quadrado q1 = new Quadrado();

        //chamar metodo
        double area = q1.calcularArea(2);
        System.out.println("Area: " + area);

        //chamar metedo 2
        double areaRetangulo = q1.calcularArea(2, 4);
        System.out.println("Area retangulo: " + areaRetangulo);

        //chamar metodo 3
        double areaComprimento = q1.calcularArea(2, 4, 8);
        System.out.println("Area: " + areaComprimento);
    }
}
