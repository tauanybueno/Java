public class Main {
    public static void main(String[] args){
        //captura o retorno do metodo em uma variavel
        int resultado = encontrarMax(10, 50);

        //imprime o resultado
        System.out.println(resultado);

    }
    //criar um metodo com retorno
    public static int encontrarMax(int n1, int n2){
        int maiorValor;
        if(n1 > n2){
            maiorValor = n1;
        }else{
            maiorValor = n2;
        }
        return maiorValor;
    }
}
