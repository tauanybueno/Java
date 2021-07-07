public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //metodos
    /*
    Atributos private não são vísiveis pela subclasse
    Utilizar o metodo protected para permitir acesso à subclasse e as classes do mesmo pacote
     */
    protected void aumentarSalario(double percentual){
        this.salario += this.salario * (percentual/100.00);
    }

    public String toString(){
        return "Nome: " + nome + "\nSalário: " + salario;
    }

}
