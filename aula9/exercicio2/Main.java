import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // criando uma lista de figuras geometricas
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        // criando figuras e adicionando-as na lista
        figuras.add(new Circulo("circulo", 2.5));
        figuras.add(new Quadrado("quadrado", 5));
        figuras.add(new Triangulo("triangulo", 3, 2));
        figuras.add(new Elipse("elipse", 1, 2));
        figuras.add(new Losango("losango", 2, 4));

        // iterando sobre a lista com foreach e
        // imprimindo nome e area de cada figura
        for (FiguraGeometrica figura : figuras) {
            System.out.println("nome: " + figura.getNome());
            System.out.println("area: " + figura.calcularArea());

            if (figura instanceof Quadrilatero) {
                System.out.println("possuo quatro lados");
            } else if (figura instanceof Conica) {
                System.out.println("nao possuo lados");
            } else if (figura instanceof Triangulo) {
                System.out.println("possuo tres lados");
            }
            System.out.println("-------------------");
        }
    }

}

