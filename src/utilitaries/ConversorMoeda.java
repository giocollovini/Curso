package utilitaries;

public class ConversorMoeda {
	
	public static final double TAXA_IOF = 6.0; 
	
	public static double vlrReal;

	public static double valorPagamento(double vlrDolar, double qtdDolar) {
		return (converteValorDolar(vlrDolar, qtdDolar) + calculaIof());
	}

	public static double converteValorDolar(double vlrDolar, double qtdDolar) {
		return vlrReal = vlrDolar * qtdDolar;
	}
	
	public static double calculaIof() {
		return (vlrReal * TAXA_IOF) / 100;
	}

}
