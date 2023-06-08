package br.com.turma.teste;

import java.util.List;

import br.com.turma.model.Usuario;
import br.com.turma.model.UsuarioDao;

public class TesteMostrarTodos {

	public static void main(String[] args) {
	
		UsuarioDao usuarioDao = new UsuarioDao(); 
		List<Usuario> usuA = usuarioDao.mostrarTodos();
		
		for (Usuario usuario : usuA) {
			
			System.out.println("nome: " + usuario.getId());
			System.out.println("nome: " + usuario.getNome());
			System.out.println("login: " + usuario.getLogin());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println("");
		
		}
		
	}
	
}


