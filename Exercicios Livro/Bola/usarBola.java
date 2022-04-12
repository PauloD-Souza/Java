package Bola;

public class usarBola extends TipoB {
    private String tipo;
    public usarBola(String nome, int tamanho, String tipo) {
        super(nome, tamanho);
        this.tipo = tipo;
        
    }
    public void Mostrar(){
        super.Mostrar();
        System.out.println(tipo);
    }
}