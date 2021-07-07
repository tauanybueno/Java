import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
Projeto feito por: Tauany Gabriel Bueno
RA: 21361335
 */

public class Main {
    public static void main(String[] args) {

        //instanciar um objeto do tipo chatbot
        Chatbot bot = new Chatbot();

        //adicionar resp
        Resposta rs1 = new RespostaSimples("nome", "Me chama de TatauBot");
        Resposta rs2 = new RespostaData("dia");
        Resposta rs3 = new RespostaHora("horas");
        Resposta rs4 = new RespostaContador("conta");

        //criando as piadas
        ArrayList<String> piadas = new ArrayList<>();
        piadas.add("Qual é o peixe baterista? A truta!");
        piadas.add("Qual é o peixe que cai do céu? Atum!");
        piadas.add("O que o pato disse para a pata? Vem Quá!");
        piadas.add("Qual a cidade brasileira que não tem taxi? Uberlandia!");
        Resposta rs5 = new RespostaAleatoria("piada", piadas);

        //adicionando respostas ao chatbot
        bot.adicionar(rs1);
        bot.adicionar(rs2);
        bot.adicionar(rs3);
        bot.adicionar(rs4);
        bot.adicionar(rs5);

        System.out.println("------------------");
        System.out.println("INICIANDO O CHATBOT");
        System.out.println("------------------");

        Scanner entrada = new Scanner(System.in);
        String texto;

        while (true) {
            System.out.println("> ");
            texto = entrada.nextLine().toLowerCase(Locale.ROOT);
            System.out.println(bot.processar(texto));
        }
    }
}
