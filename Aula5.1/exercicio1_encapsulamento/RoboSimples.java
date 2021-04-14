public class RoboSimples {
    private char direcao;

    public void setDirecao(char novaDirecao){
        if(novaDirecao != 'N' && novaDirecao != 'S' && novaDirecao != 'L' && novaDirecao != 'O'){
            this.direcao = 'N';
        }else{
            this.direcao = novaDirecao;
        }

    }

    public char getDirecao(){
        return direcao;
    }



}
