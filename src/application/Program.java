package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Triangle;
import utilitaries.Calculator;
import utilitaries.ContaBancaria;
import utilitaries.ConversorMoeda;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
	/*	
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("=====================================================================");
		System.out.println("Programa para Ler Tres medidas dos triangulos X e Y.");
		System.out.println("Mostrar a �rea de cada um dos Triangulos e informar qual possui a maior �rea.");
		System.out.println();
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		// --------------------------------------------------------------------------------------------------------------

		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Programa para Ler o Nome, Pre�o e Quantidade em estoque de um Produto.");
		System.out.println("Mostrar valor em estoque. Pedir QTD a diminuir e QTD a aumentar no estoque.");
		System.out.println();
		sc.nextLine();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		//declarado aqui por causa que criei Construtor para primeiro obrigar usuario entrar com os valores
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product); 
		
		//Se quiser alterar Name do Produto e Quantidade e mostrar os novos valores
		//Podemos usar os Metodos GET e SET Implemantados
		product.setName("Novo Nome");
		System.out.println("Updated Name: " + product.getName());
		product.setPrice(123.51);
		System.out.println("Updated Price: " + product.getPrice());

		// --------------------------------------------------------------------------------------------------------------

		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Programa para Ler o Valor de um RAIO.");
		System.out.println("Mostrar valor da Circunferencia, Volume e o valor do PI.");
		System.out.println();
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		// --------------------------------------------------------------------------------------------------------------

		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Programa para Ler Cota��o e Quantidade de dolar, mais 6% imposto IOF.");
		System.out.println("Mostrar valor a ser pago em REAIS.");
		System.out.println();
		System.out.print("Qual � a cota��o do Dolar? ");
		double dolar = sc.nextDouble();
		System.out.print("Quantos D�lares voc� quer comprar? ");
		double quantidadeDolar = sc.nextDouble();

		double result = ConversorMoeda.valorPagamento(dolar, quantidadeDolar);

		System.out.printf("Valor a ser pago em Reais: %.2f%n", result); 
		
		*/
		// --------------------------------------------------------------------------------------------------------------

		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Programa para Ler Num Conta, Nome Titular e Dep�sito Inicial.");
		System.out.println("Realizar uma opera��o de Dep�sito e Saque e mostrar as informa��es da Conta.");
		System.out.println();
		System.out.print("N�mero da Conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do Titular da Conta: ");
		String nomeTitular = sc.nextLine();
				
		ContaBancaria contaBanc = new ContaBancaria(numConta, nomeTitular); 
		
		double depositoInicial = 0.0;
		System.out.print("Deseja fazer um dep�sito Inicial (s/n)? ");
		char depositar = sc.next().charAt(0) ; 
		if (depositar == 's') {
			System.out.print("Valor de dep�sito Inicial: ");
			depositoInicial = sc.nextDouble();		
		}
		
		contaBanc.inicializaConta(depositoInicial);
		
		System.out.println();
		System.out.println(contaBanc);
		System.out.println();
		System.out.print("Entre com o Valor de dep�sito: ");
		double valor = sc.nextDouble();
		contaBanc.depositoConta(valor);		
		System.out.println(contaBanc);
		System.out.println();
		System.out.print("Entre com o Valor de Saque: ");
		valor = sc.nextDouble();
		contaBanc.saqueConta(valor);		
		System.out.println(contaBanc);		

		sc.close();

	}

}
