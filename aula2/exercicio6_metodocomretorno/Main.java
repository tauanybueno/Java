import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        //armazena valor digitado em uma variavel
        int n1 = sc.nextInt();

        //captura return em uma variavel
        int resultado = calculaSomatorio(n1);

        //imprime
        System.out.print("Soma: " + resultado);

    }
    //cria metodo com retorno
    public static int calculaSomatorio(int num){
        int soma = 0; //inicializa variavel
        for(int i = 1; i <= num; i++){
            soma += i;
        }
        return soma;
    }
}
