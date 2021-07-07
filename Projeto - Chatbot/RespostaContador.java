import java.util.Locale;

public class RespostaContador extends Resposta {
    private int contador;
    private String saida4;


    public RespostaContador(String entrada) {
        super(entrada);
    }

    @Override
    public boolean verifica(String entrada) {
        if (entrada.contains("conta".toLowerCase(Locale.ROOT))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String produz() {
        contador++;
        saida4 = "Ok! A conta atualmente está em: " + contador;
        return saida4;
    }

}

