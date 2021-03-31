public class Main {
    public static void main(String[] args){

        //instacniar um objeto da classe Pessoa
        Pessoa objetoPessoa = new Pessoa();

        //insere dados
        objetoPessoa.nome = "Maria";
        objetoPessoa.idade = 24;
        objetoPessoa.altura = 1.58;

        //acessa dados
        //System.out.println("Nome: " + objetoPessoa.nome);
        //System.out.println("Idade: " + objetoPessoa.idade);
        //System.out.println("Altura: " + objetoPessoa.altura);

        //chama metodo toString
        System.out.println(objetoPessoa.toString());
    }
}
