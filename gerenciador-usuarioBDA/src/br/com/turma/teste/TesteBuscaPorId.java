package br.com.turma.teste;

import br.com.turma.model.Usuario;
import br.com.turma.model.UsuarioDao;

public class TesteBuscaPorId {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscaId(1);
		
		System.out.println("ID: " + usuario.getId());
		System.out.println("nome: " + usuario.getNome());
		System.out.println("login: " + usuario.getLogin());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("");
	}

}