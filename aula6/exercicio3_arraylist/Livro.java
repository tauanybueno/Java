public class Livro {
    //atributos
    private String nome;
    private int ISBN;

    //construtor
    public Livro(String nome, int ISBN){
        this.nome = nome;
        this.ISBN = ISBN;
    }

    //metodo toString
    public String toString(){
        return "\nNome: " + nome + " \nISBN: " + ISBN;
    }
}
