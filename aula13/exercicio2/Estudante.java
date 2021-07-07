public class Estudante {
    private String nome;
    private double notaN1;
    private double notaN2;

    public Estudante (String nome, double notaN1, double notaN2){
        this.nome = nome;
        this.notaN1 = notaN1;
        this.notaN2 = notaN2;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia(){
        double mediaFinal = notaN1 * 0.4 + notaN2 + 0.6;
        return mediaFinal;
    }
}
