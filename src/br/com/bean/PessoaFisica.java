package br.com.bean;

public class PessoaFisica extends Pessoa {
	
	private String cpf;

	
	public PessoaFisica(){}
	public PessoaFisica(String nome, String email, String telefone, Endereco endereco, String cpf) {
		super(nome, email, telefone, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}







}