public class Main {

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        ponto1.coodenadaX = 20;

        Ponto ponto2 = new Ponto();
        ponto2.coodenadaY = 4;

        System.out.println("p1 x: " + ponto1.coodenadaX);

        ControlePosicao cp = new ControlePosicao();
        cp.incrementaCoordenadaX(ponto1, 50);

        System.out.println("p1 x: " + ponto1.coodenadaX);

        System.out.println("ponto2 " + ponto2.coodenadaY);
        cp.incrementaCoordenadaY(ponto2, 4);
        System.out.println("ponto2 " + ponto2.coodenadaY);

    }
}
