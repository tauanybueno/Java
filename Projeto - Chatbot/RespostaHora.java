import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class RespostaHora extends Resposta {
    //atributos
    private SimpleDateFormat horas = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()); //pega a hora local do dispositivo
    //https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
    private Date hora = Calendar.getInstance().getTime();
    private String saida3;


    public RespostaHora(String entrada) {
        super(entrada);
    }

    @Override
    public boolean verifica(String entrada) {
        if (entrada.contains("hora".toLowerCase(Locale.ROOT))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String produz() {
        saida3 = "Agora são " + horas.format(hora);
        return saida3;
    }


}
