import java.util.Scanner;

public class Calculo {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        double resultado = 0;

        System.out.println("Digite tres numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        resultado = (n1 + n2) / n3;
        //chama o metodo e passa o parametro
        imprimir(resultado);

        System.out.println("Digite outro numero: ");
        int n4 = sc.nextInt();

        resultado = resultado + n4;
        //chama o metodo e passa o parametro
        imprimir(resultado);
    }
    //cria metodo
    public static void imprimir(double resultado){
        System.out.println("---------------");
        System.out.print("\tResultado: " + resultado);
    }
}
