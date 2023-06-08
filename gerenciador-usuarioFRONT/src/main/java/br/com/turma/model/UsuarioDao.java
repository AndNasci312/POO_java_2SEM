package br.com.turma.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

	// fazer a identação automática = ctrl + shift + F
	// CRUD:
	
	public void cadastrar(Usuario usuario){

		String SQL = "insert into Usuario(nome, login, senha) values (?,?,?)";

		try (Connection con = conexao.obterConexao()) {

			try (PreparedStatement preparador = con.prepareStatement(SQL)) {

				preparador.setString(1, usuario.getNome());
				preparador.setString(2, usuario.getLogin());
				preparador.setString(3, usuario.getSenha());
				preparador.execute();
				System.out.println("cadastro feito!");
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
		
	public static List<Usuario> mostrarTodos(){
		
		String SQL = "SELECT * FROM Usuario";
		List<Usuario> usuarios = new ArrayList<>();

		try (Connection con = conexao.obterConexao()) {

			try (PreparedStatement preparador = con.prepareStatement(SQL)) {

				ResultSet result = preparador.executeQuery();

				while (result.next()) {
					Usuario usu = new Usuario();
					usu.setId(result.getInt("id"));
					usu.setNome(result.getString("nome"));
					usu.setLogin(result.getString("login"));
					usu.setSenha(result.getString("senha"));
					usuarios.add(usu);

				}
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return usuarios;

	}
	
	public Usuario buscaId(int ID) {
		
		String sql = "SELECT * FROM Usuario WHERE id=?";
		Usuario usuario = null;

		try (Connection con = conexao.obterConexao()) {
			try (PreparedStatement prepa = con.prepareStatement(sql)) {
				prepa.setInt(1, ID);

				try (ResultSet resulta = prepa.executeQuery()) {
					if (resulta.next()) {
						usuario = new Usuario();
						usuario.setId(resulta.getInt("id"));
						usuario.setNome(resulta.getString("nome"));
						usuario.setLogin(resulta.getString("login"));
						usuario.setSenha(resulta.getString("senha"));
					}
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;

	}

	public void alterar(Usuario usuario) {


		String sql = "UPDATE Usuario SET nome=?, login=?, senha=? WHERE id=?";

		try (Connection con = conexao.obterConexao()) {
			try (PreparedStatement prepara = con.prepareStatement(sql)) {
				prepara.setString(1, usuario.getNome());
				prepara.setString(2, usuario.getLogin());
				prepara.setString(3, usuario.getSenha());
				prepara.setInt(4, usuario.getId());
				prepara.execute();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deletar (int id) {
		
		String sql = "DELETE FROM Usuario WHERE id=?";

		try (Connection con = conexao.obterConexao()) {
			try (PreparedStatement pre = con.prepareStatement(sql)) {
				pre.setInt(1, id);
				pre.execute();
				System.out.println("usuario excluido!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Usuario verificarLogin(String login, String senha) {
		String sql  = "SELECT * FROM Usuario WHERE login=? AND senha=?";
		Usuario usua = null; 
		
		try (Connection con = conexao.obterConexao()) {
			try (PreparedStatement preparador = con.prepareStatement(sql)) {
				preparador.setString(1, login);
				preparador.setString(2, senha);
				
				ResultSet result = preparador.executeQuery();
				
				if(result.next()) {
					Usuario usuar = new Usuario();
					usuar.setId(result.getInt("id"));
					usuar.setNome(result.getString("nome"));
					usuar.setLogin(result.getString("Login"));
					usuar.setSenha(result.getString("senha"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usua;
	}
}




