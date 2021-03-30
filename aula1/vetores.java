import java.util.Scanner;
public class vetores {

    /* Faça um programa que leia a idade de 10 pessoas armazene-as em um vetor
    e depois imprima o conteúdo desse vetor
     */

    public static void main(String[] args){

        //declara vetor de inteiros tamanho 10
        int [] idades = new int[10];

        Scanner sc = new Scanner(System.in);

        //laço para ler 10 idades e armazenar no vetor
        for (int i = 0; i < 10; i++){
            System.out.println("Digite sua idade: ");
            idades[i] = sc.nextInt();
        }

        //laço para imprimir o conteúdo do vetor
        for (int i = 0; i < 10; i++){
            System.out.println(idades[i]);
        }

        sc.close();

    }
}
