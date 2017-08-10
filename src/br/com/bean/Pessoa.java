package br.com.bean;

public class Pessoa {
	
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;
	
	

		public Pessoa (){}
		public Pessoa (String nome,  String email, String telefone, Endereco endereco){
		 
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		
		
		
		}
		
		
		
		public String getNome(){
			
			return nome;
		}
		
		public void setNome(String nome){
			this.nome = nome;
		}
		
		public Endereco getEndereco (){
			return endereco;
		}
		
		public void setEndereco (Endereco endereco){
			this.endereco = endereco;
	
		}
		
		public String getEmail (){
			return email;
		}
		
		public void setEmail (String email){
			this.email = email;
		}
		
		public String getTelefone (){
			return telefone;
		}
		
		public void setTelefone (String telefone){
			this.telefone = telefone;
		}
		
	
		
		
		public String getImprime(){
			
			return "Nome: " + nome + "\n" + "Endereço " + endereco.getImprime() + "\n" + "E-mail: " + email + "\n" + "Telefone: " + telefone + "\n" +  "Carro " ;
			
		}
		
	
}



