public class Gerente extends Funcionario{

    private int nrFuncionarios; //atributo apenas de gerente, não herda

    public Gerente (String nome, double salario, int nrFuncionarios){
        //chama o construtor da superclasse
        super(nome, salario);
        this.nrFuncionarios = nrFuncionarios;
    }

    /*a classe Gerente tem os mesmos métodos de funcionários porém com funcionamento
    diferente - utiliza Polimorfismo
    @Override - significa que um método está sendo subrescrito
    */

    @Override
    public void aumentarSalario (double percentual){
        super.aumentarSalario(percentual + 20); //chama o método da superclasse
    }

    @Override
    public String toString(){
        return super.toString() + "\nNúmero de funcionários: " + nrFuncionarios;
    }


}
