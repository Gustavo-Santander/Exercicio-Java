package Exercicio3;

public class TesteControle {

	public static void main(String[] args) {

		Televisao tv = new Televisao();
		
		ControleRemoto cr = new ControleRemoto();
		
		Televisao tv1 = new Televisao("Jornal", 18);
		
		//tv1.setCanalTelevisao("Jornal");
		//tv1.setNumeroCanal(18);
		
		ControleRemoto cr1 =new ControleRemoto(14, 100);
		cr1.setCanalTelevisao("Globo");
		cr1.setNumeroCanal(19);
		cr1.setPotenciaVolume(100);
		cr1.setVolume(15);
		
		cr1.ControlarVolume(45);
		System.out.println(cr1.getVolume());
		
		cr1.ConsultarControle(15, "teste", 24);
		System.out.println(cr1.getPotenciaVolume()+""+cr1.getVolume());
		
		
		//cr.ControlarVolume(0)

	}

}
