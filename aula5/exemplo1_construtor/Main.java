public class Main {
    public static void main(String[] agrs){

        //instanciar objeto do tipo pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Fulano";

        System.out.println("Nome p1: " + p1.nome);

        Pessoa p2 = new Pessoa("Maria");
        System.out.println("Nome p2: " + p2.nome);





    }
}
