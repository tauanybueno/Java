public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.add(new Funcionario("Fulano", 20, 10));
        empresa.add(new Funcionario("Cilano", 20, 50));
        empresa.add(new Funcionario("Beltrano", 20, 20));
        empresa.add(new Funcionario("Deltrano", 20, 30));
        empresa.add(new FuncionarioSenior("Master Fulano", 20, 30, 100));
        empresa.add(new FuncionarioSenior("Master Ciclano", 20, 30, 50));

        System.out.println("---------------FUNCIONARIOS----------------");
        empresa.listar();
        System.out.println("---------------SALARIOS----------------");
        empresa.listarSalario();
        System.out.println("---------------SENIORS----------------");
        empresa.totalDeFuncionariosSenior();
        System.out.println("---------------FAIXA SALARIAL----------------");
        empresa.listarPorFaixaSalarial(200, 500);
    }
}
