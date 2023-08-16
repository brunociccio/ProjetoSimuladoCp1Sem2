package br.com.fiap.beans;

public class PessoaJuridica extends Cadastro {
	// var
	private String cnpj;
	private String inscricaoEstadual;
	// const vazio
	public PessoaJuridica() {
		super();
	}
	// const cheio
	public PessoaJuridica(String cnpj, String inscricaoEstadual) {
		super();
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	// heranca
	public PessoaJuridica(String nome, String rg, int idade, float altura, String cnpj, String inscricaoEstadual) {
		super(nome, rg, idade, altura);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	// setters and getters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

}
