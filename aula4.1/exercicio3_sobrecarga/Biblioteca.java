public class Biblioteca {
    //metodo emprestar
    public void emprestar (Livro livro, int RA){
        livro.status = "emprestado";
        livro.raAluno = RA;
    }
}
