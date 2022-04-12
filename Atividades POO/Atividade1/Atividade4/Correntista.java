package Atividade1.Atividade4;

public class Correntista {
    private String cpf;
    private String nome;
    private Conta conta;
    public Correntista(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.conta = conta;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
