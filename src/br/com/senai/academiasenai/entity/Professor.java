package br.com.senai.academiasenai.entity;

import java.time.LocalDate;

public class Professor {

	private Integer id;
	
	private String nomeCompleto;
	
	private LocalDate dataDeAdmissa;
	

	public LocalDate getDataDeAdmissa() {
		return dataDeAdmissa;
	}

	public void setDataDeAdmissa(LocalDate dataDeAdmissa) {
		this.dataDeAdmissa = dataDeAdmissa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
	
}
