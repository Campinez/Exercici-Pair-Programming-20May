package domain;

public class Product {
	
	
	
	private static int IdSiguiente;
	private int id; 
	String nameProduct;
	float price;
	int stock;
	
	public Product (String nameProduct, float price, int stock) {
		
		this.nameProduct=nameProduct;
		this.price=price;
		this.stock=stock;
		++IdSiguiente;
		id=IdSiguiente;
		
	}
	
	public void sales() {
		
	}
	public void restocking(int newStock) {
		
	}

}
