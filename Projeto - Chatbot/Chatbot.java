import java.util.ArrayList;

public class Chatbot {
    //criar um ArrayList para receber os objetos do tipo Resposta
    private ArrayList<Resposta> respostas;
    private boolean verificar;

    public Chatbot() {
        this.respostas = new ArrayList<>();
    }

    //adicionar: adicionar uma resposta a lista
    public void adicionar(Resposta r) {
        respostas.add(r);
    }

    public String processar(String texto) {
        //percorrer as respostas armazenas
        //se a resposta na posicao i for verdadeira
        //produz a saida
        //caso contrario, retorna que nao conhece
        for (int i = 0; i < respostas.size(); i++) {
            verificar = respostas.get(i).verifica(texto);
            if (verificar == true) {
                return respostas.get(i).produz();
            }
        }
        return "Desculpe, ainda não conheço essa palavra :(";
    }


}
