public class Tarefa {
    //atributos
    private String tarefas;

    //construtor
    public Tarefa(String tipoTarefa){
        this.tarefas = tipoTarefa;
    }

    //toString
    public String toString(){
        return "Nome da tarefa: " + this.tarefas;
    }


}
