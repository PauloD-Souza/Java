package Exercicio7;

public class Funcionario {
    private String nome;
    private double salario;
    private int porcentagem;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public int getPorcentagem(){
        return porcentagem;
    }
    public void setPorcentagem(int porcentagem){
        this.porcentagem = porcentagem;
    }
    public void incrementoSalario(int porcentagem){
        this.salario = salario * porcentagem;
    }
}
