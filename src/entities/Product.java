package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	//Cria��o de um Construtor padr�o - Cria o objeto com valores vazios
	//Esse � o padr�o do JAVA qdo n�o se declara construtores
	public Product() {
	}

	//Cria��o de um Construtor que para ao instanciar o Objeto Product
	//o mesmo n�o fique com valores name e price vazios
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
		
	//Cria��o de um Construtor que para ao instanciar o Objeto Product
	//o mesmo n�o fique com nenhum dos valores vazios
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
