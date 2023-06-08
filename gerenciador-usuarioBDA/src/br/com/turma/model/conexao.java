package br.com.turma.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

	public static Connection obterConexao() {
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/DBusuarios?useTimezone=true&serverTimezone=UTC", "root", "root@123");
			System.out.println("banco conectado com sucesso!");
		} catch (SQLException e) {
			System.out.println("acesso negado!");
			e.printStackTrace();
		}
		return con;
		
	}
	
	
}
