import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        //armazena o numero em uma variavel
        int n1 = sc.nextInt();
        sc.close();

        //captura retorno em uma variável
        boolean resultado = isPar(n1);

        //imprime resultado
        System.out.println(resultado);
    }

    //cria metodo com retorno
    public static boolean isPar(int num){
        if(num%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
