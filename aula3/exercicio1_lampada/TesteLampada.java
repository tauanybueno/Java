public class TesteLampada {
    public static void main(String[] agrs){
        //instanciar um objeto
        Lampada lp1 = new Lampada();

        //insere dados
        lp1.marca = "Philips";
        lp1.preco = 12.50;
        lp1.volts = 250;

        //testa metodo deligar
        lp1.desligar();
        System.out.println(lp1.isLigado);

        //testa metodo mudar de cor
        lp1.mudarCor("Azul");

        //testa metodo toString
        System.out.println(lp1.toString());


    }
}
