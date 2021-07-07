public abstract class FiguraGeometrica {

    private String nome;

    public FiguraGeometrica (String nome) {
        this.nome = nome;
    }

    //metodo abstrato
    public abstract double calcularArea();

    //metodo concreto que tem funcionalidade na classe abstrata
    public String getNome(){
        return this.nome;
    }
}
