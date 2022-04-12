package Bola;

public class TipoB {
    private int tamanho;
    private String nome;
    public TipoB (String nome, int tamanho){
        this.nome = nome;
        this.tamanho=tamanho;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho){
        try {
            if ((tamanho > 0) && (tamanho < 100)){
                this.tamanho = tamanho;
            }
        } catch (Exception e) {
                System.out.println("Tamanho não especificado ");
        }
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void Mostrar() {
        System.out.println(nome);
        System.out.println(tamanho);
    }
}
