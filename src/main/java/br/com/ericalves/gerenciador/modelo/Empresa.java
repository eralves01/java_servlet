package br.com.ericalves.gerenciador.modelo;

import java.util.Date;

public class Empresa {
	private Integer id;
	private String nome;
	private String cnpj;
	private Date update;
	
	public Empresa(String nome, String cnpj, Date date) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.update = date;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}
}
