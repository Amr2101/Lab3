package lab;

public class Product {
	private String prodName;
	private double prodPrice;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		if(prodPrice >= 0) {
			this.prodPrice = prodPrice;
		}
		else{
			this.prodPrice = 0.25;
		}
	}
	
	//toString
	public String toString(){
		return this.getProdName()+" "+this.getProdPrice();
	}
	//equals
	public boolean equals(Object other) {
		if(this.getProdName().equals(((Product)other).getProdName())){
			if(this.getProdPrice()==(((Product)other).getProdPrice())) {
				return true;
			}
		}
		return false;
	}
	//constructor
	public Product(String prodName, double prodPrice) {
	this.prodName = prodName;
	this.prodPrice = prodPrice;
	}
	//Our no-args constructor 
	public Product() {
		this.prodName = "Nothing";
		this.prodPrice = 0.0;
	}
	
}
