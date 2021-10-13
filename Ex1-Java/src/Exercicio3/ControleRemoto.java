package Exercicio3;

public class ControleRemoto extends Televisao {
	
	private double Volume;
	private double potenciaVolume;
	
	
	public ControleRemoto() {
		super();
	}

	public ControleRemoto(double volume, double potenciaVolume) {
		super();
		Volume = volume;
		this.potenciaVolume = potenciaVolume;
	}

	public double ControlarVolume (double volume) {
		if(this.potenciaVolume >=0)
		this.potenciaVolume = volume+1;
		else
		this.potenciaVolume = volume-1;	
		return volume;
	}
	public double MudarCanal(double numeroCanal ) {
	
		if(numeroCanal >=0)
			this.potenciaVolume = numeroCanal+1;
			else
			this.potenciaVolume = numeroCanal-1;	
			return numeroCanal;	
		//setNumeroCanal(numeroCanal); 
	}
	
	public Boolean ConsultarControle(double volume,String canalTelevisao, double numeroCanal ) {
		
		ControlarVolume(volume);
		
		MudarCanal(numeroCanal);
		
		getCanalTelevisao();
		
		return false;
		
	}
	
	public double getVolume() {
		return Volume;
	}

	public void setVolume(double volume) {
		Volume = volume;
	}

	public double getPotenciaVolume() {
		return potenciaVolume;
	}

	public void setPotenciaVolume(double potenciaVolume) {
		potenciaVolume = this.potenciaVolume;
	}
	
	

}
