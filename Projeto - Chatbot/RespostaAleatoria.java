import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class RespostaAleatoria extends Resposta {

    //criar um arraylist para armazenar as piadas do Main
    private ArrayList<String> piadaAleatoria;
    private int sorteio;

    public RespostaAleatoria(String entrada, ArrayList<String> piadas) {
        super(entrada);
        this.piadaAleatoria = piadas;
    }

    @Override
    public boolean verifica(String entrada) {
        if (entrada.contains("piada".toLowerCase(Locale.ROOT))) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String produz() {
        Random random = new Random();
        sorteio = random.nextInt(piadaAleatoria.size());
        return piadaAleatoria.get(sorteio);
    }
}



