import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Estagiario("SI", "Fulano", 20, 30));
        funcionarios.add(new Estagiario("Marketing", "Ciclano", 50, 20));
        funcionarios.add(new Estagiario("Engenharia", "Beltrano", 45, 30));
        funcionarios.add(new Supervisor(3, 2000));

        for (Funcionario f: funcionarios) {
            System.out.println(f.calcularSalario());
        }
    }
}
