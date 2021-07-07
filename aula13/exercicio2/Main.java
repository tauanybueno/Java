import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double notaN1 = 0, notaN2 = 0;
        ArrayList<Estudante> estudantes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("*******************");
            System.out.println("Digite o seu nome");
            nome = entrada.next();

            while (true) {
                try {
                    System.out.println("Digite a nota N1");
                    notaN1 = entrada.nextDouble();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Você digitou um valor errado para a nota N1");
                    System.out.println("Digite novamente");
                    entrada.nextLine(); // consome a entrada para liberar o buffer
                }
            }

            while (true) {
                try {
                    System.out.println("Digite a nota N2");
                    notaN2 = entrada.nextDouble();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Você digitou um valor errado para a nota N2");
                    System.out.println("Digite novamente");
                    entrada.nextLine(); // consome a entrada para liberar o buffer
                }
            }

            Estudante e1 = new Estudante(nome, notaN1, notaN2);
            estudantes.add(e1);

        }

        for (Estudante estudante : estudantes) {
            System.out.println(estudante.getNome());
            System.out.println(estudante.calcularMedia());
        }

        entrada.close();
    }

}
