package Atividade1.Atividade4;

import java.util.HashMap;

public interface Banco {
    HashMap<String,Correntista> correntistas = new HashMap<>();
    HashMap<Integer,Conta> contas = new HashMap<>();
    int numeroContaLivre();
    Conta criarConta(Correntista Correntista);
    Conta getConta(int Conta);
    Conta getConta(Correntista correntista);
    void addCorrentista(Correntista correntista);
    void getCorrentista(Correntista cpfCorrentista);
    int gerarNumeroConta();
}
