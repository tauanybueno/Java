import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        //criar uma lista que armazene objetos do tipo String
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        //cria objetos do tipo tarefa
        Tarefa limpar = new Tarefa("Limpar a casa");
        Tarefa almoco = new Tarefa("Fazer almoco");
        Tarefa roupa = new Tarefa("Lavar roupa");

        //adiciona os objetos no array
        tarefas.add(limpar);
        tarefas.add(almoco);
        tarefas.add(roupa);

        //quantidade de elementos
        int qtadadeTarefas = tarefas.size();


        //imprimir o conteudo do array
        for(int i = 0; i < qtadadeTarefas; i++){
            Tarefa tarefa = tarefas.get(i);
            System.out.println(tarefa.toString());
        }





    }
}
