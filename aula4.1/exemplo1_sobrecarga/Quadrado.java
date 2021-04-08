public class Quadrado {

    //metodo calcular area de todos os lados iguais
    public double calcularArea(double lado){
        return lado * lado;
    }

    //metodo para calcular area de 2 lados diferentes
    public double calcularArea(double base, double altura){
        return base * altura;
    }

    //metodo para calcular base * altura * comprimento
    public double calcularArea(double base, double altura, double comprimento){
        return base * altura * comprimento;
    }
}
