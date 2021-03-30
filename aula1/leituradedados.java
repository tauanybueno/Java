import java.util.Scanner;

public class leituradedados {
    public static void main(String[] args) {
         /*
    faça um programa que leia o nome e a idade de uma
    pessoa e imprima na tela se for > 18
    */
        //declara variável do tipo scanner
        Scanner entrada = new Scanner(System.in);

        //imprime algo na saída padrão
        System.out.println("Digite seu nome: ");

        //declara variável do tipo string
        String nome;

        //armazena o que foi digitado na variável nome
        nome = entrada.next();

        /* declara variável do tipo int */
        int idade;

        System.out.println("Digite sua idade: ");
        //armazena o valor digitado na variável idade
        idade = entrada.nextInt();

        if (idade > 18) {
            System.out.println("--------------------------------");
            System.out.println("Meu nome eh: " + nome);
            System.out.println("Minha idade eh: " + idade);
            System.out.println("--------------------------------");

        }


    }
}

