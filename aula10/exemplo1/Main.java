import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Identificacao> cadastros = new ArrayList<>();

        //criar objetos do tipo pet
        cadastros.add(new Cachorro("Costelinha", 11234));
        cadastros.add(new Gato("Garfield", 2345));
        cadastros.add(new Peixe("John", 8765));

        //criar objetos do dia funcionario
        cadastros.add(new Vendedor("Fulano", 543287, 987646, 5000));
        cadastros.add(new Veterinario("Ciclano", 653729, 87654, 40));

        //percorrer a lista e imprimir as informacoes de todos os funcionarios
        //for each - percorre todo o array
        for (Identificacao c : cadastros) {
            c.getIdentificacao();
        }

    }
}
