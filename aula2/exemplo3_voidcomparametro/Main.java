public class Main {
    public static void main(String[] agrs){
        //chama metodo na funcao principal e passa parametros
        somar(10, 7);

    }
    //cria metodo com retorno
    public static void somar(int n1, int n2){
        int resultado; //cria variavel para armazenar soma
        resultado = n1 + n2;
        System.out.println("Soma: " + resultado);

    }
}
