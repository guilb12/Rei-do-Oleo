package br.com.bean;

import java.util.Calendar;

public class Oleo {
	private Calendar data_oleo; 
	private String tipo; 
	private String nome_oleo;
	
	
	
	public Oleo(){}
	public Oleo(Calendar data_oleo, String tipo, String nome_oleo) {
		super();
		this.data_oleo = data_oleo;
		this.tipo = tipo;
		this.nome_oleo = nome_oleo;
	}
	public Calendar getData_oleo() {
		return data_oleo;
	}
	public void setData_oleo(Calendar data_oleo) {
		this.data_oleo = data_oleo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome_oleo;
	}
	public void setNome(String nome_oleo) {
		this.nome_oleo = nome_oleo;
	}

	public String getImprime(){
		
		return "Ultima Troca: "+ data_oleo + "\n" + " Tipo do Oleo: "+ tipo + "\n" + "Nome do Oleo: "+ nome_oleo;
	}
}

