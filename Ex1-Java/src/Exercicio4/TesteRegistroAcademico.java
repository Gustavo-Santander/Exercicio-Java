package Exercicio4;

public class TesteRegistroAcademico {

	public static void main(String[] args) {
		
		RegistroAcademico ra = new RegistroAcademico();
		
		RegistroAcademico r1 = new RegistroAcademico("CARLOS", 434, "23/08/2005",true, 2006, 400);

		
		ra.setNomeDoAluno("Gustavo");
		ra.setDataNascimento("23/08/2005");
		ra.setMatricula(1334);
		ra.setAnoMatricula(2006);
		ra.seteBolsista(true);
		ra.setMensalidade(400);
	
		
		ra.CalcularMensalidade(400, true,0);
		System.out.println("Valor matricula com desconto: "+ra.getMensalidade());
		
	}

}
