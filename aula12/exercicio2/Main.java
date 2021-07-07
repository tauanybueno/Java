import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual valor você gostaria de converter: ");
        Double valor = entrada.nextDouble();

        System.out.println("Qual tipo de conversão você deseja: ");
        System.out.println("1: de metros para milimetros");
        System.out.println("2: de metros para centimetros");
        System.out.println("3: de metros para decimetros");
        System.out.println("4: de milimetros para metros");
        System.out.println("5: de centimetros para metros");
        System.out.println("6: de decimetros para metros");

        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                System.out.println(Conversor.metrosParaMilimetros(valor));
                break;
            case 2:
                System.out.println(Conversor.metrosParaCentimetros(valor));
                break;
            case 3:
                System.out.println(Conversor.metrosParaDecimetros(valor));
                break;
            case 4:
                System.out.println(Conversor.milimetrosParaMetros(valor));
                break;
            case 5:
                System.out.println(Conversor.centimetrosParaMetros(valor));
                break;
            case 6:
                System.out.println(Conversor.decimetrosParaMetros(valor));
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
