package conexao_banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexaoBD {



	public static Connection faz_conexao() throws SQLException {

		

		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); //atualizado

			return DriverManager.getConnection("jdbc:mysql://127.0.0.1/mdfisio","root","123456");

			

		} catch (ClassNotFoundException e) {

			throw new SQLException(e.getException());

		}

	}

}