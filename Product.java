package com.codegnan.oopExample;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price=0.0;
		this.quantity=1;
	}
	
	public int updateQuantity(int quantity) {
		this.quantity=quantity;
		return quantity;
	}
	public int updateQuantity(int quantity,boolean add) {
		if(add) {
			return this.quantity+=quantity;
		}
		else {
			return this.quantity=quantity;
		}
	}
	public int addStock(int qty) {
		if(qty>0) {
			return quantity+=qty;
		}
		else {
			return quantity=quantity;
		}
	}
	public int removeStock(int qty) {
		if(qty>0&&qty<=quantity) {
			return quantity-=qty;
		}
		else {
			return quantity=quantity;
		}
	}
	public double discountPercentage() {
		if(quantity>=6) {
			return 15.0;
		}
		else if(quantity>=3&&quantity<6) {
			return 10.0;
		}
		else {
			return 5.0;
		}
	}
	public double getTotalCost() {
		return price*quantity;
	}
	public double getDiscountAmount() {
		return (getTotalCost()*discountPercentage())/100;
	}
	public double getFinalPrice() {
		return getTotalCost()-getDiscountAmount();
	}
	public void printProductDetails() {
        System.out.println("Product ID      : " + productId);
        System.out.println("Product Name    : " + productName);
        System.out.println("Price per Unit  : " + price);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Discount %      : " + discountPercentage() + "%");
        System.out.println("Discount Amount : " + getDiscountAmount());
        System.out.println("Final Price     : " + getFinalPrice());
		
	}
	public static void main(String[] args) {
		Product ob=new Product(123,"Face Wash",150,1);

        ob.addStock(2);
        ob.printProductDetails();
        ob.removeStock(3);
        //ob.printProductDetails();
        //ob.printProductDetails();
        //Product p2 = new Product(102, "Face Wash");
        //p2.printProductDetails();

	}

}
