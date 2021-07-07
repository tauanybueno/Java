public abstract class Estudante implements Funcionario {

    private String curso;
    private String nome;
    private int horasEstudosSemana;

    public Estudante (String curso, String nome, int horasEstudosSemana){
        this.curso = curso;
        this.nome = nome;
        this.horasEstudosSemana = horasEstudosSemana;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public int getHorasEstudosSemana() {
        return horasEstudosSemana;
    }
}
