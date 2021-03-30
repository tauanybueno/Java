public class Main {
    public static void main(String[] agrs){
        //chama o metodo na funcao principal e passa o parametro
        imprimirDadosDisciplina("Yoda");

    }
    //criar um metodo com parametro
    public static void imprimirDadosDisciplina(String nome){ //passa o parametro nome
        System.out.println("\t=========================");
        System.out.println("\tProgramacao Orientada a Objetos");
        System.out.println("\tCarga Horaria: 66 horas");
        System.out.println("\tProfessor: " + nome);
        System.out.println("\t=========================");
    }
}
