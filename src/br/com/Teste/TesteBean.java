package br.com.Teste;

import java.util.Calendar;


import javax.swing.JOptionPane;

import br.com.bean.Carro;
import br.com.bean.Endereco;
import br.com.bean.Oleo;
import br.com.bean.Pessoa;

public class TesteBean {
	
	public static void main(String[] args) {
		
		
		Oleo o = new Oleo();
		Carro c = new Carro();
		Endereco e = new Endereco();
		Pessoa p = new Pessoa();
		
		p.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		p.setEndereco(e);
		p.setEmail(JOptionPane.showInputDialog("Email: "));
		p.setTelefone(JOptionPane.showInputDialog("Telefone: "));
	
		
		
		
		
		e.setRua(JOptionPane.showInputDialog("Endereço: "));
		e.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero: ")));
		e.setBairro(JOptionPane.showInputDialog("Bairro: "));
		e.setCidade(JOptionPane.showInputDialog("Cidade: "));
		e.setCep(JOptionPane.showInputDialog("Cep: "));
		
		
		
		
		
		c.setModelo(JOptionPane.showInputDialog("Modelo do carro: "));
		c.setMarca(JOptionPane.showInputDialog("Marca do Carro: "));
		c.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano do Carro: ")));
		c.setVersao(JOptionPane.showInputDialog("Versao do Carro: "));
		c.setOleo(o);
		
		
		
		o.setNome(JOptionPane.showInputDialog("Oleo: "));
		o.setTipo(JOptionPane.showInputDialog("Tipo do Oleo: "));
		o.setData_oleo(Calendar.getInstance());
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		System.out.println(p.getImprime());
		
		
		
	

	}	
	
}
