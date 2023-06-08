package br.com.turma.teste;

import br.com.turma.model.Usuario;
import br.com.turma.model.UsuarioDao;

public class TesteCadastrar {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("yara", "ylemios", "ydoes");
		Usuario usuario2 = new Usuario("dória", "ydoria", "lester");
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.cadastrar(usuario);
		usuDao.cadastrar(usuario2);
		
	}

}
