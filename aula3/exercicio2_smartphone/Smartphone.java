public class Smartphone {
    //atributos
    public String marca;
    public double preco;
    public String modelo;
    public boolean isLigado;

    //metodo 1 - ligar
    public boolean ligar(){
        isLigado = true;
        return isLigado;
    }

    //metodo 2 - desligar
    public boolean desligar(){
        isLigado = false;
        return isLigado;
    }

    //metodo 3 - toString
    public String toString(){
        return "Marca: " + marca + "\nPreco: " + preco + "\nModelo: " + modelo;
    }
}
