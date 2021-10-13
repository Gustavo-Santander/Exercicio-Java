package Exericicio2;

public class Elevador {
	
	private double andarAtual;
	private Double totalAndares;
	private String capacidadeElevador;
	private String pessoasPresentes;
	
	public Elevador() {
		super();
		
	}

	public Elevador(double andarAtual, Double totalAndares, String capacidadeElevador, String pessoasPresentes) {
		super();
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
		this.pessoasPresentes = pessoasPresentes;
	}
	
	public double Inicializar (String capacidadeElevador,double totalAndares ) {
		
		
		return totalAndares;
	}
	
	public boolean Entrar (String pessoasPresentes) {
	
		return false;
		
	}
	public boolean Sair(String pessoasPresentes) {
		return false;
	}
	
	public double Sobe(double andarAtual, double totalAndares) {
		
		return andarAtual;
	}
	public double Desce(double andarAtual, double totalAndares) {
		
		return andarAtual;
	}
	
	
	public double getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(double andarAtual) {
		this.andarAtual = andarAtual;
	}

	public Double getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(Double totalAndares) {
		this.totalAndares = totalAndares;
	}

	public String getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(String capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public String getPessoasPresentes() {
		return pessoasPresentes;
	}

	public void setPessoasPresentes(String pessoasPresentes) {
		pessoasPresentes = pessoasPresentes;
	}
	
	
	
	
	

}
