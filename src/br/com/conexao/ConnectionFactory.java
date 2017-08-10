package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



//classe de conexão com o banco de dados


public class ConnectionFactory {
	
	
	
	//private static ConnectionFactory conn = null;
	
	// metodo "GET" que retorna a conexão
 	
	public Connection getConnection(){
		
		
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
		
		
		
		
	try {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/rei_do_oleo","root","");
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
		
		
		
	}
	

}
