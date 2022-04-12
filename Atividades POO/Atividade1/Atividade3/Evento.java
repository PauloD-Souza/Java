package Atividade1.Atividade3;

import java.util.Calendar;

public class Evento {

    private String nome;
    private int horas;
    private String local;
    private Calendar data;

    public Evento(String nome, int horas, String local, Calendar data) {
        this.nome = nome;
        this.horas = horas;
        this.local = local;
        data = Calendar.getInstance();
    }

    public Evento(Agenda agenda) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
} 
    
