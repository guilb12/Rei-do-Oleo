package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.bean.Endereco;
import br.com.bean.Pessoa;

public class PessoaDAO {
	
	public void adiciona(Connection conn, Pessoa p, Endereco e){
		
		
		
		try {
			PreparedStatement stmt = 
			conn.prepareStatement("inset into pessoa (nome, email, telefone, rua, numero, bairro, cidade, cep) " + "value(?, ?, ?, ?, ?, ?, ?, ?)");
			
			stmt.setString(1, p.getNome());
			stmt.setString(2,p.getEmail());
			stmt.setString(3,p.getTelefone());
			stmt.setString(4, e.getRua());
			stmt.setInt(5,e.getNumero());
			stmt.setString(6,e.getBairro());
			stmt.setString(7,e.getCidade());
			stmt.setString(8,e.getCep());
			
			
			
			
			//executa
			
			stmt.execute();
			stmt.close();
			
			
			System.out.println("Cadastro Realizado com Sucesso!");
			
			
		} catch (SQLException e1) {
			
			
			
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	

}
