package br.com.turma.teste;

import br.com.turma.model.UsuarioDao;

public class TesteRemover {

	public static void main(String[] args) {

		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.deletar(1);
	}

}
