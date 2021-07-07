public abstract class Funcionario implements Identificacao{

    private String nome;
    private int RG;
    private int CPF;

    public Funcionario (String nome, int RG, int CPF){
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public int getRG() {
        return RG;
    }

    public int getCPF() {
        return CPF;
    }

    public abstract double calcularSalario();
}
