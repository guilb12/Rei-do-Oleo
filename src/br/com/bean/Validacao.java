package br.com.bean;

public class Validacao {
	
	
	public boolean Valida(String nome){
	
		String Pessoa = nome;
		
		return Pessoa.matches("[A-Z][a-z]{1,}");
		
		
	}
		
	
	public static void main(String[] args) {

		
		String email = "guilherme.borges12outlook.com";
		
		if (email.contains("@")){
			System.out.println("email valido");
		} else {
			
			System.out.println("Você é burro ?");
		}
		
		Validacao v = new Validacao();
		

		System.out.println(v.Valida("waldemir"));
		
		
	String numero = "11992286268";
		
	
	
		if (numero.length() == 11 ){
			
			System.out.println("Telefone Valido");
		} else {
			
			System.out.println("Fala essa merda direito idiota!");
		}
		
		
		
		if (numero.contains("9")){
			
			System.out.println("Nono digito ok");
			
		} else {
			
			System.out.println("Favor informar telefone correto");
		}
		
		
	}
	
	
}
	
	

	
	
	
	

