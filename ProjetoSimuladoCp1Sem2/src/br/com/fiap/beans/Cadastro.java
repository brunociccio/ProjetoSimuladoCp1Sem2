package br.com.fiap.beans;

public class Cadastro {
	// var
	private String nome;
	private String rg;
	private int idade;
	private float altura;
	// const vazio
	public Cadastro() {
		super();
	}
	// const cheio
	public Cadastro(String nome, String rg, int idade, float altura) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
		this.altura = altura;
	}
	// setters and getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
