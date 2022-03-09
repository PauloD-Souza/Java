package Atividade1;

public class Curso {
    private String nome;
    private String descricao;
    private int codigoCurso;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCodigoCurso() {
        return codigoCurso;
    }
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    @Override
    public String toString(){
        return "O curso escolhido foi "+this.nome+"Com o código " +this.codigoCurso;
    }


}
