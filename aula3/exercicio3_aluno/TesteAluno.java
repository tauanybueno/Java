import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] agrs) {
        //instanciar um objeto
        Aluno aluno1 = new Aluno();

        //inserir dados
        aluno1.nome = "João";
        aluno1.ra = 12345678;
        aluno1.n1 = 7.8;
        aluno1.n2 = 8.5;


        //apresenta dados
        System.out.println(aluno1.toString());
        System.out.println("A media do aluno é: " + aluno1.calcularMedia());
    }
}