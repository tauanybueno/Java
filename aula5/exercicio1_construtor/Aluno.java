public class Aluno {
    //atributos
    public String nome;
    public int RA;

    //construtor com parametros
    public Aluno(int ra){
        this.RA = ra;
    }

    //construtor 2 com parametros
    public Aluno(String nome, int ra){
        this.nome = nome;
        this.RA = ra;
    }
}
