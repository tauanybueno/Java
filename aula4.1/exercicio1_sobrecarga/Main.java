public class Main {
    public static void main(String[] agrs){

        //instanciar um objeto da classe matematica
        Matematica mat = new Matematica();

        //testar metodo 1
        int soma1 = mat.somarNumeros(10, 15);

        //testar metodo 2
        double soma2 = mat.somarNumeros(10.5, 5.7);

        System.out.println("Soma inteiros: " + soma1);
        System.out.println("Soma doubles: " + soma2);
    }
}
