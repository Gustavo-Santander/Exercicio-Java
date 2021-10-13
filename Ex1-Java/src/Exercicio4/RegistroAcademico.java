package Exercicio4;

public class RegistroAcademico {
	
	private String  nomeDoAluno;
	private int matricula;
	private String  dataNascimento ;
	private Boolean eBolsista;
	private int anoMatricula;
	private double mensalidade;
	
	
	public RegistroAcademico() {
		super();
		
	}
	public RegistroAcademico(String nomeDoAluno, int matricula, String dataNascimento, Boolean eBolsista,
			int anoMatricula, double mensalidade) {
		super();
		this.nomeDoAluno = nomeDoAluno;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
		this.eBolsista = eBolsista;
		this.anoMatricula = anoMatricula;
		this.mensalidade = mensalidade;
	}
	
	public double CalcularMensalidade(double  mensalidade , Boolean  ebolsista, double valorDesconto) {
	
		
		if(ebolsista= true) {
		mensalidade =400;
		valorDesconto = 0.5;
		//valorDesconto  = mensalidade - 0.5;
		this.mensalidade = mensalidade * valorDesconto;
		return valorDesconto;
		}
		else{
		 return  mensalidade;	
		}
		
	}
	
	public Boolean MostrarRegistro(String nomeDoAluno, int matricula, String dataNascimento, Boolean eBolsista,int anoMatricula, double mensalidade) 
	{
		
		return false;
	}
	
	
	
	
	
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Boolean geteBolsista() {
		return eBolsista;
	}
	public void seteBolsista(Boolean eBolsista) {
		this.eBolsista = eBolsista;
	}
	public int getAnoMatricula() {
		return anoMatricula;
	}
	public void setAnoMatricula(int anoMatricula) {
		this.anoMatricula = anoMatricula;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
	
	
	

}
