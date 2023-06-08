package br.com.turma.teste;

import br.com.turma.model.Usuario;
import br.com.turma.model.UsuarioDao;

public class TesteAlterar {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(1, "nayara", "nayZinha", "Nay300");
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.alterar(usuario);

	}

}
