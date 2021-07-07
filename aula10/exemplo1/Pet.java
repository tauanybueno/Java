public abstract class Pet implements Identificacao {

    private String nome;
    private int id;

    public Pet (String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public String getNome (){
        return nome;
    }

    public int getId (){
        return id;
    }

    //metodo abstrato que vai ser implementado pelas classes que herdarem
    public abstract  void falar ();
}
