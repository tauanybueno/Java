import java.util.Locale;

public class RespostaSimples extends Resposta {
    private String saida;

    //construtor
    public RespostaSimples(String entrada, String saida) {
        super(entrada);
        this.saida = saida;
    }


    public boolean verifica(String entrada) {
        if (entrada.contains("nome".toLowerCase(Locale.ROOT))) {
            return true;
        } else {
            return false;
        }
    }

    public String produz() {
        saida = "Me chamam de TatauBot";
        return saida;
    }

}
