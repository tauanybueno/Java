public class Main {
    public static void main(String[] args){
        //instanciar um objeto da classe aluno
        Aluno aluno1 = new Aluno(1234567);
        Aluno aluno2 = new Aluno("Maria", 33445566);

        System.out.println("Aluno RA: " + aluno1.RA);
        System.out.println("Nome: " + aluno2.nome + "\nRA: " + aluno2.RA);
    }
}
