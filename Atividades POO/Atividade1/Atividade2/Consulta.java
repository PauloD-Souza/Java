package Atividade1.Atividade2;

import java.util.Calendar;

public class Consulta {
    private Calendar data;
    private String descricao;
    private Prontuario Prontuario;
    public Consulta(Prontuario prontuario) {
        this.Prontuario = prontuario;
        data = Calendar.getInstance();
    }
    public Calendar getData() {
        return data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Prontuario getProntuario() {
        return Prontuario;
    }
    public void setProntuario(Prontuario prontuario) {
        Prontuario = prontuario;
    }
    
    
}
