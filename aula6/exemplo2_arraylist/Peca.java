public class Peca {
    //atributos
    private String nome;
    private String cor;

    //construtor - obriga o usuário a criar o objeto com valores iniciais
    public Peca(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }

    //imprimir informacoes da classe
    public String toString(){
        return "Nome: " + this.nome + " " + "Cor: " + this.cor;

    }



}
