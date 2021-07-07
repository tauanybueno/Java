public class SomaUniversal {

    public int calcular(int num1, int num2) throws UniversalException {
        int resultado = num1 + num2;
        if (resultado == 42){
            throw new UniversalException();
        }else{
            return resultado;
        }
    }
}
