package Atividade1.Atividade2;

import java.util.LinkedList;
import java.util.List;

public class Prontuario{
    private Paciente paciente;

    private List<Consulta> consulta = new LinkedList<>();

    public Prontuario(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consulta criarConsulta() {
    return new Consulta(this);
    }

    public List<Consulta> getConsultas() {
        return consulta;
    }
}
