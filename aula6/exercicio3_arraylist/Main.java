public class Main {
    public static void main(String[] args){
        //instanciar um obejto do tipo biblitoeca
        Biblioteca biblioteca = new Biblioteca();

        //adicione varios objetos
        Livro livro1 = new Livro("Jogos Vorazes", 97804390);
        Livro livro2 = new Livro("Em chamas", 97804390);

        //adicionar objetos livro a biblioteca
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);

        //imprimir livros
        biblioteca.imprimirLivros();

    }
}
