public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario (String nome, int horasTrabalhadas, double valorHora){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    //calcular e retornar o salario final de um funcionario
    public double salarioFinal (){
        return horasTrabalhadas * valorHora;
    }

    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String toString(){
        return "Nome: " + nome + "\nHoras trabalhadas: " + horasTrabalhadas + "\nValor por hora: " + valorHora;
    }
}
