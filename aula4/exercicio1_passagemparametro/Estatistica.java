public class Estatistica {

    public double media(int n1, int n2, int n3){
        double media = (n1 + n2 + n3)/3;
        return media;
    }

    public int diferencaAbsoluta(int n1, int n2){
       int diferenca = Math.abs(n1 - n2);
       return diferenca;
    }
}
