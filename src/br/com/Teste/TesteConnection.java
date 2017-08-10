package br.com.Teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.conexao.ConnectionFactory;

public class TesteConnection {

	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		
		try {
			
		
		conn = new ConnectionFactory().getConnection();
	
		System.out.println("Conexão aberta");
		
		} catch(Exception e){
			
			System.out.println("Erro de conexão");
			e.printStackTrace();
			
		} finally{
			
			conn.close();
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
