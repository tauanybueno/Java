public class Veterinario extends Funcionario{

    private double horasAtendidas;

    public Veterinario (String nome, int RG, int CPF, double horasAtendidas){
        super(nome, RG, CPF);
        this.horasAtendidas = horasAtendidas;
    }

    public void setHorasAtendidas(double horasAtendidas) {
        this.horasAtendidas = horasAtendidas;
    }

    @Override
    public double calcularSalario() {
        return 120 * horasAtendidas;
    }

    @Override
    public void getIdentificacao() {
        System.out.println(this.getNome() + " " + this.getRG() + " " + this.getCPF());
    }
}
