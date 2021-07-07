public class Supervisor implements Funcionario{

    private int qtdSupervisionados;
    private double salarioBase;

    public Supervisor (int qtdSupervisionados, double salarioBase){
        this.qtdSupervisionados = qtdSupervisionados;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase * this.qtdSupervisionados;
    }
}
