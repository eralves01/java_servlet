package br.com.ericalves.gerenciador.action;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ericalves.gerenciador.inteface.Acao;
import br.com.ericalves.gerenciador.modelo.Database;
import br.com.ericalves.gerenciador.modelo.Empresa;

public class EditaEmpresa implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Empresa empresa = new Empresa(request.getParameter("nome"), request.getParameter("cnpj"), Calendar.getInstance().getTime());
		
		Database db = new Database();
		db.editaEmpresa(id, empresa);
		
		return "redirect:mainServlet?action=ListaEmpresas";
	}

}
