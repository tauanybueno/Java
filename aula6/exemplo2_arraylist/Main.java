import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Peca bispo = new Peca("Bispo", "preta");
        System.out.println(bispo.toString());

        //criar uma lista de pecas para adicionar varias pecas
        ArrayList<Peca> pecas = new ArrayList<>();

        //cria um objeto
        Peca cavalo = new Peca("Cavalo", "branca");
        Peca torre = new Peca("Torre", "preta");
        Peca peao = new Peca("Peao", "branca");
        Peca rainha = new Peca("Rainha", "preta");

        //armazena as pecas na lista
        pecas.add(bispo);
        pecas.add(cavalo);
        pecas.add(torre);
        pecas.add(peao);
        pecas.add(rainha);

        //verificar quantos elementos tenho adicionado
        int qtadePecas = pecas.size();
        System.out.println("Quantidade de pecas: " + qtadePecas);

        //recuperar cada peca da lista e imprimir seu conteudo
        for(int i = 0; i < qtadePecas; i++){
            Peca p = pecas.get(i);
            System.out.println(p.toString());
        }
    }
}
