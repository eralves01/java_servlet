package br.com.ericalves.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Database {
	
	private static List<Empresa> empresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Date date = new Date();
		Empresa emp1 = new Empresa("Alura", "11223344", date);
		emp1.setId(Database.chaveSequencial++);
		Empresa emp2 = new Empresa("Stone", "123123123", date);
		emp2.setId(Database.chaveSequencial++);
		Database.empresas.add(emp1);
		Database.empresas.add(emp2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Database.chaveSequencial++);
		Database.empresas.add(empresa);
		System.out.println("Empresa adicionada ao banco.");
	}
	
	public List<Empresa> getEmpresas(){
		return Database.empresas;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = Database.empresas.iterator();
		
		while(it.hasNext()) {
			Empresa empresa = it.next();
			if (empresa.getId() == id) {
				it.remove();
			}
		}
		
		// Funciona caso não queira alterar nada na lista
//		for	(Empresa empresa : Database.empresas) {
//			if (empresa.getId() == id) {
//				Database.empresas.remove(empresa);
//			}
//		}
	}
	
	public void editaEmpresa(Integer id, Empresa empresaEditada) {		
		Empresa empresa = buscaEmpresaPeloId(id);
		empresa.setCnpj(empresaEditada.getCnpj());
		empresa.setNome(empresaEditada.getNome());
		empresa.setUpdate(new Date());
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for	(Empresa empresa : Database.empresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
