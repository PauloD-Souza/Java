package Atividade1.Atividade4;

import java.util.Calendar;

public class Transacao {
	private int id;
	private Calendar data;
	private Double valor;
	
	public Transacao(int id, Calendar data, Double valor) {
		this.id = id;
		this.data = data;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}
    

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public String toString() {
		return "Transacao [id=" + id + ", valor=" + valor + "]";
	}

}