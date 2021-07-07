public class Main {
    public static void main(String[] args) {

        //criando um funcionário
        Funcionario funcionario = new Funcionario("Fulano", 4000);
       // System.out.println(funcionario.toString());
        Funcionario funcionario1 = new Funcionario("Beltrano", 4000);
        Gerente gerente = new Gerente("Ciclano", 6000, 1);

        Departamento dp = new Departamento();
        //adicionando funcionarios ao departamento
        dp.adicionarFuncionarios(funcionario);
        dp.adicionarFuncionarios(funcionario1);
        dp.adicionarFuncionarios(gerente);

        dp.aumentarSalarioEquipe(20);
        dp.imprimirFuncionario();

        //aumentando o salario do funcionario
        //funcionario.aumentarSalario(30);
        //System.out.println(funcionario.toString());


        //aumentando o salario do gerente
        //gerente.aumentarSalario(10);
        //System.out.println(gerente.toString());
    }
}
