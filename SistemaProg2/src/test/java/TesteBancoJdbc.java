import java.util.List;

import org.junit.Test;

import DAO.contabancariaDAO;
import Model.contabancaria;
import conexaojdbc.SingleConnection;

public class TesteBancoJdbc {

	@Test
	public void InitBanco () {
		contabancariaDAO contabancariaDAO = new contabancariaDAO();
		contabancaria contabancaria = new contabancaria(); // objeto de modelo
		contabancaria.setNroconta(1014);
		contabancaria.setSaldo(216.78);
		contabancaria.setDtabertura("20201111");
		contabancaria.setDtencerramento("20211211");
		contabancaria.setSenha(143342);;
		contabancaria.setSituacao(1);
		contabancariaDAO.salvar(contabancaria);
	}
	
	@Test
	public void initListar() {
		contabancariaDAO dao = new contabancariaDAO();
		try {
			List<contabancaria> list = dao.listar();
			for(contabancaria contabancaria : list) {
				System.out.println(contabancaria);
			//	System.out.println(contabancaria.getNroconta());
				System.out.println("---------------------------------");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Test
	public void initBuscar() {
		contabancariaDAO dao = new contabancariaDAO();
		try {
			contabancaria contabancaria = dao.buscar(1010);
			System.out.println(contabancaria);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void initAtualizar() {
		contabancariaDAO dao = new contabancariaDAO();
		try {
			contabancaria objetobanco = dao.buscar(1010);
			objetobanco.setSituacao(90);
			dao.atualizar(objetobanco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
