package Atividade1.Atividade1;
import java.util.HashMap;



public class Curso {
    private String nome;
    private String descricao;
    private Integer codigoCurso;
    private HashMap <String , Aluno> NovosAlunos;
       
    public Curso(String nome,String descricao,Integer codigoCurso){
        this.nome = nome;
        this.descricao = descricao;
        this.codigoCurso = codigoCurso;
        NovosAlunos = new HashMap <>();

    }
    public void matriculaAluno (Aluno aluno){
        aluno.setCurso(this);
        NovosAlunos.put(aluno.getMatricula(),aluno);
    }
    public Aluno getAluno(String matricula){
        return NovosAlunos.get(matricula);

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
