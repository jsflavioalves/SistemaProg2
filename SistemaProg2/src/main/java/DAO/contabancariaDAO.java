package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.contabancaria;
import conexaojdbc.SingleConnection;

import java.util.ArrayList;
import java.util.List;

public class contabancariaDAO {

	private Connection connection;

	public contabancariaDAO() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar(contabancaria contabancaria) {
		String sql = "insert into contabancaria (NroConta, Saldo, DtAbertura, DtEncerramento, Senha, Situacao)\r\n" + 
				"values (?,?,?,?,?,?)\r\n" + 
				"";
		try {
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setInt(1, contabancaria.getNroconta());
			insert.setDouble(2, contabancaria.getSaldo());
			insert.setNString(3, contabancaria.getDtabertura());
			insert.setNString(4, contabancaria.getDtencerramento());
			insert.setInt(5, contabancaria.getSenha());
			insert.setInt(6, contabancaria.getSituacao());
			insert.execute(); //joga no banco
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public List<contabancaria> listar() throws Exception {
		List<contabancaria> list =  new ArrayList<contabancaria>();
		
		String sql = "Select * from contabancaria";
		try {
			PreparedStatement consulta = connection.prepareStatement(sql);
			ResultSet resultado = consulta.executeQuery();
			
			while (resultado.next()) {
				contabancaria Contabancaria = new contabancaria();
				Contabancaria.setNroconta(resultado.getInt("Nroconta"));
				Contabancaria.setSaldo(resultado.getDouble("Saldo"));
				Contabancaria.setDtabertura(resultado.getString("Dtabertura"));
				Contabancaria.setDtencerramento(resultado.getString("Dtencerramento"));
				Contabancaria.setSenha(resultado.getInt("Senha"));
				Contabancaria.setSituacao(resultado.getInt("Situacao"));
				list.add(Contabancaria);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public contabancaria buscar(int nrocont) throws Exception {
		contabancaria conta =  new contabancaria();
		
		String sql = "Select * from contabancaria where nroconta =" + nrocont;
		try {
			PreparedStatement consulta = connection.prepareStatement(sql);
			ResultSet resultado = consulta.executeQuery();
			
			while (resultado.next()) { //retorna apenas um ou nenhum
				conta.setNroconta(resultado.getInt("Nroconta"));
				conta.setSaldo(resultado.getDouble("Saldo"));
				conta.setDtabertura(resultado.getString("Dtabertura"));
				conta.setDtencerramento(resultado.getString("Dtencerramento"));
				conta.setSenha(resultado.getInt("Senha"));
				conta.setSituacao(resultado.getInt("Situacao"));
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conta;
		
	}
}
