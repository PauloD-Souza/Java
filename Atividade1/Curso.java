package Atividade1;
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private String descricao;
    private Integer codigoCurso;
    List<Aluno> alunos = new ArrayList<>();
    public Curso (){

    }   
    public Curso(String nome,String descricao,Integer codigoCurso){
        this.nome = nome;
        this.descricao = descricao;
        this.codigoCurso = codigoCurso;

    }
    public void matricularAluno (Aluno aluno){
        alunos.add(aluno);
    }
    public String getAluno(String matricula){
        return matricula;
    }
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
