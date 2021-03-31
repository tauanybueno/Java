public class Aluno {
    //atributos
    public String nome;
    public int ra;
    public double n1;
    public double n2;

    //metodo 1 - calcular a média final
    public double calcularMedia(){
        return (n1 + n2) / 2;
    }

    //metodo 2 - mostrar dados do aluno
    public String toString(){
        return "Nome: " + nome + "\nRA: " + ra + "\nNota N1: " + n1 + "\nNota N2: " + n2;
     }



}

