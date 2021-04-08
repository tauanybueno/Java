public class Gerente {
    //atributos
    public String nome;

    //metodos
    public void atualizar (Funcionario f, String cargo){
        f.cargo = cargo; //funcionario f recebe salario
    }

    public void atualizar (Funcionario f,double salario){
        f.salario = salario;
    }
}
