package br.com.bean;

public class Carro {
	
	private String modelo; 
	private String marca;
	private int ano;
	private String versao;
	private Oleo oleo;
	
	
	public Carro(){}
	public Carro(String modelo, String marca, int ano, String versao, Oleo oleo) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.versao = versao;
		this.oleo = oleo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public Oleo getOleo() {
		return oleo;
	}
	public void setOleo(Oleo oleo) {
		this.oleo = oleo;
	}
	
		public String getImprime(){
			
			return " Modelo: " + modelo + "\n" + "Marca: " + marca + "\n" +  "Ano: " + ano + "\n" + "Versão: "+ versao + "\n" + "Oleo: " + oleo.getImprime() ;
		}

	
		
	}
	
	
	
	
	

