package Atividade1.Atividade2;

import java.util.HashMap;

public class clinica {
    private HashMap <Paciente,Prontuario> prontuarios = new HashMap<>();

    public void addPaciente(Paciente paciente){
        prontuarios.put(paciente, new Prontuario(paciente));
    }
    public Prontuario getPaciente(Paciente paciente){
        return prontuarios.get(paciente);
    }
}
