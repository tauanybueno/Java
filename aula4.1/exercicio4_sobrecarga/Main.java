public class Main {
    public static void main(String[] agrs){
        //objeto aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joao";
        aluno1.RA = 1234556;

        //cria duas provas e associa o aluno a cada uma
        Prova n1 = new Prova();
        n1.nota = 7.5;
        n1.raAluno = aluno1.RA;
        Prova n2 = new Prova();
        n2.nota = 6.5;
        n2.raAluno = aluno1.RA;

        //cria o professor e faz a media
        Professor professor = new Professor();
        professor.calcularMediaFinal(aluno1, n1, n2);

        //imprimir informacoes
        System.out.println(aluno1.toString());
    }
}
