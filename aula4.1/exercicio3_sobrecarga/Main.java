public class Main {
    public static void main(String[] agrs){
        //instanciar objeto da classe Aluno
        Aluno aluno = new Aluno();
        aluno.nome = "Maria";
        aluno.RA = 123456;
        System.out.println(aluno.toString());

        //instanciar objeto da classe livro e coloca o status como disponivel
        Livro livro = new Livro();
        livro.status = "disponivel";
        livro.ISBN = "3456789";
        System.out.println("Livro antes do emprestimo: ");
        System.out.println(livro.toString());

        //instaciar um objeto biblioteca e emprestar o livro
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.emprestar(livro, aluno.RA);
        System.out.println(livro.toString());

    }
}
