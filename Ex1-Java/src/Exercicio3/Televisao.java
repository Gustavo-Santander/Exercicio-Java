package Exercicio3;

public class Televisao {
	
	private String canalTelevisao;
	private double numeroCanal;
	
	
	public Televisao() {
		super();
	}


	public Televisao(String canalTelevisao, double numeroCanal) {
		super();
		this.setCanalTelevisao(canalTelevisao);
		this.setNumeroCanal(numeroCanal);
	}


	public double getNumeroCanal() {
		return numeroCanal;
	}


	public void setNumeroCanal(double numeroCanal) {
		this.numeroCanal = numeroCanal;
	}


	public String getCanalTelevisao() {
		return canalTelevisao;
	}


	public void setCanalTelevisao(String canalTelevisao) {
		this.canalTelevisao = canalTelevisao;
	}

	
	
	
	
}
