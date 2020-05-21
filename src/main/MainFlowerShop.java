package main;

import controller.FlowerShop;

public class MainFlowerShop {

	public static void main(String[] args) {


		FlowerShop flowerShop1= new FlowerShop();
		
		FlowerShop.createFlower(String nameProduct, float price, int stock, String color);
		FlowerShop.createTree(String nameProduct, float price, int stock, float heigh);
		FlowerShop.createDecoration(String nameProduct, float price, int stock, String material);
		
		

	}

}
