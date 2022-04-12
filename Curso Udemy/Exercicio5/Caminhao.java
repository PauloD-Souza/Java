package Exercicio5;

public class Caminhao extends Veiculo {
    private int eixos;
    public Caminhao(String placa, int eixos,int ano){
        super(placa,ano);
        this.eixos = eixos;

    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    @Override
    public String toString() {
        return "Caminhao [eixos=" + eixos + "]";
    }
    
}
