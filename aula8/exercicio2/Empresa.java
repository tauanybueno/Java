import java.util.ArrayList;

public class Empresa {

    private ArrayList<Funcionario> funcionarios;

    public Empresa (){
        funcionarios = new ArrayList<>();
    }

    //add: armazenar os funcionarios a lista
    public void add (Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    //listar: imprime o dado de todos os funcionarios
    public void listar (){
        for (Funcionario funcionario: funcionarios) {
            System.out.println(funcionario);
        }
    }

    //listarSalario: imprime o nome e o salario de todos os funcionarios
    public void listarSalario(){
        for (Funcionario funcionario: funcionarios) {
            System.out.println(funcionario.salarioFinal());
        }
    }

    //totalDeFuncionariosSenior: instanceof
    public int totalDeFuncionariosSenior (){
        int total = 0;
        for (Funcionario funcionario: funcionarios) {
            if (funcionario instanceof FuncionarioSenior){
                total++;
            }
        }
        return total;
    }

    //listarPorFaixaSalarial
    public void listarPorFaixaSalarial (double min, double max){
        for (Funcionario funcionario: funcionarios) {
            double salario = funcionario.salarioFinal();
            if (salario >= min && salario <= max){
                System.out.println(funcionario);
            }
        }
    }
}
