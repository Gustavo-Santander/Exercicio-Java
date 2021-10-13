package Exercicio5;

public class AutomovelAVenda {
	
private double  precoVenda;
private String  nomeVeiculo;
private String 	placaVeiculo;


public AutomovelAVenda() {
	super();
}


public AutomovelAVenda(double precoVenda, String nomeVeiculo, String placaVeiculo) {
	super();
	this.precoVenda = precoVenda;
	this.nomeVeiculo = nomeVeiculo;
	this.placaVeiculo = placaVeiculo;
}

public double getPrecoVenda() {
	return precoVenda;
}

public void setPrecoVenda(double precoVenda) {
	this.precoVenda = precoVenda;
}

public String getNomeVeiculo() {
	return nomeVeiculo;
}

public void setNomeVeiculo(String nomeVeiculo) {
	this.nomeVeiculo = nomeVeiculo;
}

public String getPlacaVeiculo() {
	return placaVeiculo;
}

public void setPlacaVeiculo(String placaVeiculo) {
	this.placaVeiculo = placaVeiculo;
}









}
