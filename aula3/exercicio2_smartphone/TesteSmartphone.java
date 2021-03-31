public class TesteSmartphone {
    public static void main(String[] agrs){

        //instanciar um objeto
        Smartphone smartphone1 = new Smartphone();

        //insere dados
        smartphone1.marca = "Apple";
        smartphone1.preco = 8.999;
        smartphone1.modelo = "Iphone 11 mini";

        //testar metodo - desligar
        smartphone1.desligar();
        System.out.println(smartphone1.isLigado);

        //testar metodo - ligar
        smartphone1.ligar();
        System.out.println(smartphone1.isLigado);

        //testar metodo toString
        System.out.print(smartphone1.toString());
    }
}
