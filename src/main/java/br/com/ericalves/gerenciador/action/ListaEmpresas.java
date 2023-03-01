package br.com.ericalves.gerenciador.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ericalves.gerenciador.inteface.Acao;
import br.com.ericalves.gerenciador.modelo.Database;
import br.com.ericalves.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database db = new Database();
		List<Empresa> empresas = db.getEmpresas();
		
		request.setAttribute("empresas", empresas);
		
		return "forward:ListaEmpresas.jsp";
	}
}
