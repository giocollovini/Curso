package utilitaries;

public class ContaBancaria {
	
	private int numeroConta;
	String titularConta;
	
	private double saldoConta; 
	private double depositoInicial;
	private double valorMovintado; 	
	private static final double taxaBanco = 5.00;
	
	public ContaBancaria() {		
	}
	
	public ContaBancaria(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}

	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitularConta() {
		return titularConta;
	}
	
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public double getDepositoInicial() {
		return depositoInicial;
	}
	
	public double depositoConta(double valorMovintado) { 		
		return this.saldoConta += valorMovintado;
	}	
		
	public double saqueConta(double valorMovintado) {
		return this.saldoConta = saldoConta - valorMovintado - taxaBanco;
	}
	
	public void inicializaConta(double depositoInicial) {
		this.saldoConta += depositoInicial;
	}
	
	public String toString() {
		return "Conta: " + numeroConta + "  - Titular: " + titularConta + "  - Saldo: $ " + String.format("%.2f", saldoConta);
	}
}
