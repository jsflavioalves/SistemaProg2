package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

	private static String url = "jdbc:mysql://localhost:3306/bancoestacio?createDatabaseIfNotExist=true&serverTimezone=UTC";
	private static String user = "root";
	private static String password = "admin";
	private static Connection connection = null;
	
	//De qualquer lugar no sistema posso chamar o metodo conectar
	static {
		conectar();
	}
	// Construtor 
	public SingleConnection() {
		conectar();
	}

	private static void conectar () {
		try {
			if(connection == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, password);
			//	connection.setAutoCommit(false);
				System.out.println("Conexao deu certo !");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//retorna nossa conexao de qualquer lugar do sistema
	public static Connection getConnection () {
		return connection;		
	}
}
