package Atividade1.Atividade3;
import java.util.*;
 
public class Agenda {

    private List<Evento> eventos = new LinkedList<>();

    public void addEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public Evento criarEvento() {
        return new Evento(this);
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}

