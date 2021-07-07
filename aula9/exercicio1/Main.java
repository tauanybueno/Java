import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        Criar uma lista para armazenar as figuras geometricas
        Imprimir o nome + area de todos
         */

        //criando uma lista de figuras Geometricas
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        //criando figuras e adicionando a lista
        figuras.add(new Circulo("Circulo", 2.5));
        figuras.add(new Quadrado("Quadrado", 4));
        figuras.add(new Triangulo("Triangulo", 1, 3));
        figuras.add(new Losango("Losango", 2, 2));
        figuras.add(new Elipse("Elipse", 1, 4));

        /*iterando sobre a lista com foreach
        imprimir o nome e a area
         */
        for (FiguraGeometrica figura: figuras) {
            System.out.println("Nome: " + figura.getNome());
            System.out.println("Area: " + figura.calcularArea());
        }
    }
}
