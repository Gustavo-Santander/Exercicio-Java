package Exercicio1;

public class TestePessoa {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();

		Pessoa p2 = new Pessoa("Gustavo", 01, 03, 2001, 1.78, 0, 2021);

		
		
		p2.setNome("Gustavo");
		p2.setDia(01);
		p2.setMes(03);
		p2.setAno(2001);
		p2.setAltura(1.78);
		p2.setAnoAtual(2021);
		
		//p1.CalcularIdade("Gustavo", 01, 03, 2004, 1.78, 3);
		//p2.CalcularIdade("Gustavo", 01, 03, 2001, 1.78, 13, 2021);
		//p1.CalcularIdade("Gustavo", 02, 4, 2001, 1.79, 0);
		//System.out.println("Idade:"+p2.getidade());

		//p2.MostrarDados("Gustavo", 01, 03, 2004, 1.78, 0);
		p2.MostrarDados("Gustavo", 01, 03, 2001, 1.78, 0, 2021);
		System.out.println("Nome :" + p2.getNome() + " " + "Dia :" + p2.getDia());
		System.out.println("Mes :" + p2.getMes() + " " + "Ano :" + p2.getAno());
		System.out.println("Altura :" + p2.getAltura() + " " + "Idade :" + p2.getidade());

	}

}
