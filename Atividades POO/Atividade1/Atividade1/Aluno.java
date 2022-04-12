package Atividade1.Atividade1;

public class Aluno{
    private String nome;
    private Curso curso;
    private String matricula;

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    @Override
    public String toString(){
        return "O nome do aluno pesquisado é " +this.nome+"e a sua matricula é"+this.curso;
    }
}

