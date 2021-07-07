public class Vendedor extends Funcionario{

    private double salario;

    public Vendedor (String nome, int RG, int CPF, double salario){
        super(nome, RG, CPF);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public void getIdentificacao() {
        System.out.println(this.getNome() + " " + this.getCPF() + " " + this.getRG());
    }
}
