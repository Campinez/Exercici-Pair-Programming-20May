package domain;

public class Product {
	
	
	int id0;
	int id=id0+1;
	
	String nameProduct;
	float price;
	int stock;
	
	public Product (String nameProduct, float price, int stock) {
		
		this.nameProduct=nameProduct;
		this.price=price;
		this.stock=stock;
		
	}
	
	public void sales() {
		
	}
	public void restocking(int newStock) {
		
	}

}
