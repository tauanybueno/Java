public class Professor {
    //metodo
    public void calcularMediaFinal(Aluno aluno, Prova n1, Prova n2){
        aluno.mediaFinal = 0.4 * n1.nota + 0.6 * n2.nota;
    }
}
