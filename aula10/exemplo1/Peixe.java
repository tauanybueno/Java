public class Peixe extends Pet{

    public Peixe (String nome, int id){
        super(nome, id);
    }

    @Override
    public void falar() {
        System.out.println("glub glub");
    }

    @Override
    public void getIdentificacao() {
        System.out.println(this.getNome() + " " + this.getId());
    }
}
