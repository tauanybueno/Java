import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] agrs){

        ArrayList<Integer> idades = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma idade: ");

        int idade = 0;
        while(idade >=0){
            idade = entrada.nextInt();
            idades.add(idade);
        }

        int qtadeIdade = idades.size();

        for(int i = 0; i < qtadeIdade; i++){
            int var = idades.get(i);
            System.out.println(var);
        }




    }
}
