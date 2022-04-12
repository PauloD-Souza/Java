package Exercicio6;

public class Produto {
    private Double preco;
    private int quatidade;
    private String nome;

    public double totalValorEstoque(){
        return preco *quatidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addProduto(int quatidade){
        this.quatidade += quatidade;
    }
    public void RemoveProduto(int quantidade){
        this.quatidade -= quantidade;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public int getQuatidade() {
        return quatidade;
    }
    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }
    @Override
    public String toString(){
        return nome
                +", "
              +String.format("%.2f", preco)
              +"RS "
              +quatidade
              +" unidades"
              +", valor em estoque "
              +String.format("%.2f", totalValorEstoque());
    }
    
}
