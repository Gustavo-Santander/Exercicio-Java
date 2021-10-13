package Exercicio5;

public class VeiculoAVenda extends AutomovelAVenda {

	private static String tipoVeiculo = "Automovel";

	
	
	
	public static String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public static void setTipoVeiculo(String tipoVeiculo) {
		VeiculoAVenda.tipoVeiculo = tipoVeiculo;
	}
}
