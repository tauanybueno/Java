import java.util.Scanner;
public class funcoes {

    /* Crie um programa que receba 2 números como parametro de entrada e retorne
    a média desses dois números como retorno da função
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero1 = entrada.nextInt();
        System.out.println("Digite um segundo numero");
        int numero2 = entrada.nextInt();

        double valorMedia;
        valorMedia = media(numero1, numero2);
        System.out.println("Imprimindo a media:");
        System.out.println(valorMedia);

        // encerra o buffer de leitura de dados
        entrada.close();
    }

    public static double media(int n1, int n2) {
        double resultado = (n1 / n2);
        return resultado;
    }
}
