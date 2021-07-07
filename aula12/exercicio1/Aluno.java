public class Aluno {
    private String nome;
    private int RA;
    //variável global
    private static int contadorRA; //todos os objetos visualizam esse contador

    public Aluno (String nome){
        this.nome = nome;
        contadorRA++;
        RA = contadorRA; //RA vai ser igual ao valor atual do RA - variável local
    }

    public String getNome() {
        return this.nome;
    }

    public int getRA() {
        return RA;
    }

    public String toString(){
        return "Nome: " + nome + " RA: " + RA;
    }


}
