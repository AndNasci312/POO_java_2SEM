package br.com.turma.teste;

import br.com.turma.model.Usuario;
import br.com.turma.model.UsuarioDao;

public class TesteVerificarLogin {

	public static void main(String[] args) {
		String login = "ydoria";
		String senha = "lester";
		
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usu = usuarioDao.verificarLogin(login, senha);
		
		System.out.println("id" + usu.getId());
		System.out.println("nome" + usu.getNome());
		System.out.println("login" + usu.getLogin());
		System.out.println("senha" + usu.getSenha());
		
	}

}
