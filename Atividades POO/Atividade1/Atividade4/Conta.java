package Atividade1.Atividade4;                                                                
import java.util.Calendar;
import java.util.LinkedList;                                                                
import java.util.List;                                                                      
                                                                                            
public class Conta {                                                                        
	private Correntista correntista;                                                        
	private int numero;                                                                 
	                                                                                        
	private int idTransacao = 0;                                                            
	                                                                                        
	private List<Transacao> transacoes = new LinkedList<>();                                
                                                                                            
	public Conta(Correntista correntista, Integer numero) {                                 
		this.correntista = correntista;                                                     
		this.numero = numero;                                                               
	}                                                                                       
	                                                                                        
	public Double saldo() {                                                                 
		double saldo = 0;                                                                   
		                                                                                    
		for(Transacao transacao : transacoes) {                                             
			saldo += transacao.getValor();                                                  
		}                                                                                   
		                                                                                    
		return saldo;                                                                       
	}                                                                                       
	                                                                                        
	public void depositar(Double valor) {                                                   
		transacoes.add(new Transacao(++idTransacao, Calendar.getInstance(), valor));        
	}                                                                                       
	                                                                                        
	public void sacar(Double valor) {                                                       
		transacoes.remove(new Transacao(++idTransacao, Calendar.getInstance(), valor));     
	}                                                                                       
	                                                                                        
	                                                                                        
                                                                                            
} 
    
