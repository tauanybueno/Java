import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;

        //do {
            try {
                System.out.println("Digite um numerador:");
                int numerador = sc.nextInt();

                System.out.println("Digite o denominador: ");
                int denominador = sc.nextInt();

                Matematica ma = new Matematica();
                int resultado = ma.dividir(numerador, denominador);
                System.out.println("Resultado: " + resultado);
                continua = false;

            } catch (InputMismatchException ex) {
                System.out.println("Digite números inteiros! Digite novamente");
                sc.nextLine(); //descarta entrada para o usuário tentar novaemnte
            } catch (ArithmeticException ex) {
                System.out.println("Denominador não pode ser zero! Digite novamente");
            }finally {
                sc.close();
            }
        //}while (continua);


    }

}
