public class Main {
    public static void main(String[] agrs){
        //chama metodo e passa o parametro
        //somar(10, 30);

        //armazena o metodo soma em uma variavel
        int resultado = somar(10, 20);

        //imprime a variavel que armazena o metodo
        System.out.println(resultado);

    }
    //cria metodo com retorno
    public static int somar(int n1, int n2){
        int soma;
        soma = n1 + n2; //armazena o valor da soma na variavel soma
        return soma; //retonar um valor
    }

}
