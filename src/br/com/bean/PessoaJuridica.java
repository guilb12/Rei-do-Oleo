package br.com.bean;

public class PessoaJuridica extends Pessoa {

	
	private String cnpj;

	
	public PessoaJuridica(){}
	public PessoaJuridica(String nome, String email, String telefone, Endereco endereco, String cnpj) {
		super(nome, email, telefone, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	
	
	
	
}




