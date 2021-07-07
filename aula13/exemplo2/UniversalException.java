public class UniversalException extends Exception{
    //extends Exception é obrigado a tratar a exceção

    @Override
    public String getMessage(){
        return "Você encontrou a resposta (42) do universo!";
    }


}
