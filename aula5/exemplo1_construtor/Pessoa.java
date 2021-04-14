public class Pessoa {
    //atributos
    public String nome;

    //construtor padrao
    public Pessoa(){

    }

    //construtor que inicializa o atributo nome
    public Pessoa(String nome){
        //this. referenciar um elemento da propria classe
        //quando tem parametros de entrada com o mesmo nome de atributos da classe
        this.nome = nome;

    }
}
