import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            System.out.println("Digite o nome do aluno: " + i);
            String nome = entrada.next();
            Aluno aluno = new Aluno(nome);
            alunos.add(aluno);
        }

        for (Aluno al: alunos) {
            System.out.println(al.toString());
        }
    }
}
