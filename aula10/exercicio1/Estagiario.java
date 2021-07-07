public class Estagiario extends Estudante{

    private int horasTrabalhoSemana;

    public Estagiario (String curso, String nome, int horasEstudoSemana, int horasTrabalhoSemana){
        super(curso, nome, horasEstudoSemana);
        this.horasTrabalhoSemana = horasTrabalhoSemana;
    }

    public int horasDedicacao (){
       return this.getHorasEstudosSemana() + this.horasTrabalhoSemana;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabalhoSemana * 10;
    }
}
