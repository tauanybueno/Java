public class Main {
    public static void main(String[] agrs){
        //instanciar um objeto da classe Funcionario
        Funcionario funcionario = new Funcionario();
        //instaciar um objeto da classe gerente
        Gerente gerente = new Gerente();

        //testar classe funcionario
        funcionario.nome = "Joao";
        funcionario.cargo = "Dev Back-End";
        funcionario.salario = 5800;
        System.out.println("Informacoes do funcionario: ");
        System.out.println(funcionario.toString());

        //testar classe gerente
        gerente.atualizar(funcionario, "Dev Front-End");
        gerente.atualizar(funcionario, 5900);
        System.out.println("Informacoes atualizadas: ");
        System.out.println(funcionario.toString());

    }
}
