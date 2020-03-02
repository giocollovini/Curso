package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	//Criação de um Construtor padrão - Cria o objeto com valores vazios
	//Esse é o padrão do JAVA qdo não se declara construtores
	public Product() {
	}

	//Criação de um Construtor que para ao instanciar o Objeto Product
	//o mesmo não fique com valores name e price vazios
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
		
	//Criação de um Construtor que para ao instanciar o Objeto Product
	//o mesmo não fique com nenhum dos valores vazios
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
