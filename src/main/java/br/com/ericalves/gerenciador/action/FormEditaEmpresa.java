package br.com.ericalves.gerenciador.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ericalves.gerenciador.inteface.Acao;
import br.com.ericalves.gerenciador.modelo.Database;
import br.com.ericalves.gerenciador.modelo.Empresa;

public class FormEditaEmpresa implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Database db = new Database();
		Empresa empresa = db.buscaEmpresaPeloId(id);
		
		request.setAttribute("empresa", empresa);
		
		return "forward:FormEditaEmpresa.jsp";
	}

}
