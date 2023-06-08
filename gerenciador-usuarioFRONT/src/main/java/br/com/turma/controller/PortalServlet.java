package br.com.turma.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.turma.model.Usuario;
import br.com.turma.model.UsuarioDao;

@WebServlet("/portal")
public class PortalServlet extends HttpServlet {
		
	// ctrl + espaço + service + primeira opção
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		
		if(sessao.getAttribute("usuarioLogado") == null) {
			response.sendRedirect("formlogin.jsp");
			return;
			
		}
		
		String idStr = request.getParameter("txtid");
		String nome = request.getParameter("txtnome");
		String log = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		String acao = request.getParameter("acao");
		
		if (acao.equals("cadastrar")) {
		Usuario user = new Usuario(nome,log,senha);
		
		UsuarioDao dao = new UsuarioDao();
		dao.cadastrar(user);
		
		} else if (acao.equals("alterar")) {
			int id = Integer.valueOf(idStr);
			
			Usuario usuario = new Usuario (id,nome,log,senha);
			UsuarioDao usuarioDao = new UsuarioDao();
			usuarioDao.alterar(usuario);
		}
		
		response.sendRedirect("portal?acao=mostrar");
	}
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			HttpSession sessao = request.getSession();
			
			if(sessao.getAttribute("usuarioLogado") == null) {
				response.sendRedirect("formlogin.jsp");
				return;
				
			}
			
			String acao = request.getParameter("acao");
			
			if (acao.equals("mostrar")) {
				UsuarioDao usuarioDao = new UsuarioDao();
				List<Usuario> usuarios = usuarioDao.mostrarTodos();
				
				request.setAttribute("lista", usuarios); 
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/mostrartodos.jsp");
				rd.forward(request, response);
				
			} if(acao.equals("excluir")) {
			
			int id = Integer.valueOf(request.getParameter("id"));
			
			UsuarioDao usuadao = new UsuarioDao();
			usuadao.deletar(id);
			
			response.sendRedirect("portal?acao=mostrar");
			
			} if (acao.equals("alterar")) {
				
				int id = Integer.valueOf(request.getParameter("id"));
				
				UsuarioDao usuDao1 = new UsuarioDao();
				Usuario usuario1 = usuDao1.buscaId(id);
				
				request.setAttribute("usuario", usuario1);
				RequestDispatcher rtd = request.getRequestDispatcher("formalterar.jsp");
				rtd.forward(request, response);	
				
			}
			
		}
	}





