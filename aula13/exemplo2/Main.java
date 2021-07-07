import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite um novo numero: ");
        int numero2 = sc.nextInt();

        SomaUniversal soma = new SomaUniversal();

        try {
            int resultado = soma.calcular(numero1, numero2);
            System.out.println("Soma: " + resultado);
        } catch (UniversalException e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
