public class FuncionarioSenior extends Funcionario{

    private double bonus;

    public FuncionarioSenior (String nome, int horasTrabalhadas, double valorHora, double bonus){
        super(nome, horasTrabalhadas, valorHora);
        this.bonus = bonus;
    }

    //quantidade de bonus a cada 10 horas trabalhadas
    private int getQtdeBonus (){
        int qtdeBonues = getHorasTrabalhadas() / 10;
        return qtdeBonues;
    }

    @Override
    public double salarioFinal(){
        int qtdeBonus = getQtdeBonus();
        double salario = super.salarioFinal() + bonus * qtdeBonus;
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;
    }
}
