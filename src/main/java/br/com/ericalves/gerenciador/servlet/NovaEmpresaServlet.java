package br.com.ericalves.gerenciador.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ericalves.gerenciador.modelo.Database;
import br.com.ericalves.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class novaempresa
 */
@WebServlet("/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NovaEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date = Calendar.getInstance().getTime(); 
		Empresa empresa = new Empresa(request.getParameter("nome"), request.getParameter("cnpj"), date);
		Database db = new Database();
		db.adiciona(empresa);
		
		response.sendRedirect("listaEmpresas");
		
//    	RequestDispatcher rd = request.getRequestDispatcher("/lista-empresas");
//        
//        request.setAttribute("empresa", empresa);
//    	rd.forward(request, response);
	}

}
