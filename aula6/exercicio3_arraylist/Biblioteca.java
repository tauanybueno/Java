import java.util.ArrayList;

public class Biblioteca {
    //atributos
    ArrayList<Livro> livros = new ArrayList<>();

    //metodo 1 - adicionar livros
    public void adicionarLivros(Livro livro){
        this.livros.add(livro);
    }

    //metodo 2 - imprimir livros
    public void imprimirLivros(){
        for (int i = 0; i < livros.size(); i++){
            Livro l = livros.get(i);
            System.out.print(l);
        }
    }
}
