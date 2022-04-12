package Televisor;

public class Televisão {
    public int volume;
    public int canal;

    public void AumentarVolume(){
        volume++; 
    }
    public void DiminuirVolume(){
        volume--;
    }
    public void TrocarCanal(int c){
        this.canal = c;
    }
    public void mostrar(){
        System.out.println("Volume:" + volume + "\n canal :" + canal);
    }
    
    public void DiminuirCanal(){
        if (canal > 0){
            canal--;
        }
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        try {
            if ((volume < 0) && (volume > 100)){
                this.volume = volume;
            }
        } catch (Exception e) {
            System.out.println("Volúme não permitido, pois deve ser maior que 0 e menor que 100");
        }
    }
    public int getCanal(){
        return canal;
    }

    public void setCanal( int canal){
        try {
            if ((canal < 4) && (canal > 59)){
                this.canal = canal;
            }
        } catch (Exception e) {
            System.out.println("Canal fora da faixa especificada, por favor colocar em um canal válido");
        }
    }

}
