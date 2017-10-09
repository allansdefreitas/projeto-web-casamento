package br.com.ifpe.tads.projetoCasamentoWeb.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ifpe.tads.projetoCasamentoWeb.repository.ConviteRepository;

/**
 * Servlet implementation class DeletarConviteServlet
 */
public class DeletarConviteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	ConviteRepository conviteRepository;

    /**
     * Default constructor. 
     */
    public DeletarConviteServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer idConvite = Integer.getInteger( request.getParameter("idConvite"));
		
		conviteRepository.deleteById(idConvite);
		
	}

}