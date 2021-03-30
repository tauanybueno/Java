import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        //armazena o número inserido em uma variavel
        int n = sc.nextInt();
        sc.close();

        //chama o metodo e passa o parametro
        imprimirSequencia(n);

    }
    //cria metodo com retrono
    public static void imprimirSequencia(int numero){
        for(int i = 1; i <= numero; i++){
            System.out.print(i + " ");
        }
    }
}
