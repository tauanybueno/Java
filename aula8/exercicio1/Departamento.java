import java.util.ArrayList;

public class Departamento {

    private ArrayList<Funcionario> funcionarios;

    //construtor para inicializar o arraylist
    public Departamento (){
        //criei a lista de funcionarios
        funcionarios = new ArrayList<>();
    }

    //adicionar funcionarios a lista
    public void adicionarFuncionarios(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    //aplicar um aumento para toda a equipe
    public void aumentarSalarioEquipe(double percentual){
        for (int i = 0; i < funcionarios.size(); i++){
            Funcionario f = funcionarios.get(i);
            f.aumentarSalario(percentual);
        }
    }

    //imprimir as informações de toda equipe
    public void imprimirFuncionario (){
       for (int i = 0; i < funcionarios.size(); i++){
           Funcionario f = funcionarios.get(i);
           System.out.println(f.toString());
       }
    }
}
