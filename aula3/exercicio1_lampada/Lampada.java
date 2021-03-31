public class Lampada {
    //atributos
    public String marca;
    public double preco;
    public int volts;
    public boolean isLigado; //verifica se a lampada está ligada

    //metodos 1 - desligar
    public boolean desligar(){
        isLigado = false;
        return isLigado;
    }

    //metodo 2 - trocar de cor
    public void mudarCor(String cor){
        System.out.print("Mudei para: " + cor);
    }

    //metodo toString
    public String toString(){
        return "Marca: " + marca + "\nPreco: " + preco + "\nVolts: " + volts;
    }

}
