public class Cachorro extends Pet{

    public Cachorro (String nome, int id){
        super(nome, id);
    }

    @Override
    public void falar() {
        System.out.println("au au");
    }

    @Override
    public void getIdentificacao() {
        System.out.println(this.getNome() + " " + this.getId());
    }
}
