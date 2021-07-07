import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RespostaData extends Resposta {

    //logica para mostrar a data
    //usada documentação java: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    private DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    private Date data = new Date();
    private String saida2;

    public RespostaData(String entrada) {
        super(entrada);
    }

    @Override
    public boolean verifica(String entrada) {
        if (entrada.contains("dia".toLowerCase(Locale.ROOT))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String produz() {
        saida2 = "Hoje é dia " + dataFormatada.format(data);
        return saida2;
    }
}
