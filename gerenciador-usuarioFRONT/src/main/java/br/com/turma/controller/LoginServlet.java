package br.com.turma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.turma.model.Usuario;
import br.com.turma.model.UsuarioDao;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/formlogin");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("senha");
		
		UsuarioDao usuadao = new UsuarioDao();
		Usuario user = usuadao.verificarLogin(login, senha);
		
		boolean usuarioExiste = user != null;
		
		
		if(usuarioExiste) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado!", user);
			RequestDispatcher rd = request.getRequestDispatcher("portal?acao=mostrartodos.jsp");
			rd.forward(request, response);
			
			throw new RuntimeException("erro ao mostrar");
		}else {
			response.sendRedirect("formlogin.jsp");
		}
		
	}
	
}
