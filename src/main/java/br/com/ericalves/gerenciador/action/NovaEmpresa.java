package br.com.ericalves.gerenciador.action;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ericalves.gerenciador.inteface.Acao;
import br.com.ericalves.gerenciador.modelo.Database;
import br.com.ericalves.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Bananas213");
		Date date = Calendar.getInstance().getTime(); 
		Empresa empresa = new Empresa(request.getParameter("nome"), request.getParameter("cnpj"), date);
		Database db = new Database();
		db.adiciona(empresa);
		System.out.println("Bananas");
		return "redirect:mainServlet?action=ListaEmpresas";
	}

}
