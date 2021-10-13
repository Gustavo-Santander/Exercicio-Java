package Exercicio1;

public class Pessoa {

	private String nome;
	private int dia;
	private int mes;
	private int ano;
	private int idade;
	private int anoAtual;
	private double altura;

	public Pessoa() {
	}

	public Pessoa(String nome, int dia, int mes, int ano, double altura, int idade, int anoAtual) {
		super();
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.altura = altura;
		this.idade = idade;
		this.anoAtual = anoAtual;

		// this.getAnoNascimento();
	}

	public boolean CalcularIdade(String nome, int dia, int mes, int ano, double altura, int idade, int anoAtual) {

		if (this.ano + getAnoAtual() >= dia && mes > 0) {
			this.idade = anoAtual - ano;
			return true;
		}
		return false;

	}

	public boolean MostrarDados(String nome, int dia, int mes, int ano, double altura, int idade, int anoAtual) {

		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.altura = altura;
		this.CalcularIdade(nome, dia, mes, ano, altura, idade, anoAtual);

		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getidade() {
		return this.idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

}
