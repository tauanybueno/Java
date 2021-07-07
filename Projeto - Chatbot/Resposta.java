public abstract class Resposta {
    //atributos
    private String palavraChave;

    //construtor
    public Resposta(String entrada){
        this.palavraChave = entrada;
    }

    public String getPalavraChave(){
        return this.palavraChave;
    }

    //metodo 1
    public abstract boolean verifica(String entrada);

    //metodo 2
    public abstract String produz();
}
