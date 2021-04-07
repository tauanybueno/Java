public class Main {

    public static void main(String[] args){
       Estatistica dados = new Estatistica();

       int numero1 = 2;
       int numero2 = 3;
       int numero3 = 4;

       double resultado;
       resultado = dados.media(numero1, numero2 ,numero3 );
       System.out.println("media " + resultado);

       int resultado2;
       resultado2 = dados.diferencaAbsoluta(numero1, numero2);
       System.out.println("diferenca " + resultado2);
    }
}
