package com.cts.entity;
import javax.persistence.*;



@Entity
@Table(name="product_tab")
public class Product {
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int product_id;
	
	@Column(name="category",length=50)
	String category;
	
	@Column(name="name")
	String name;
	@Column(name="discription")
	String discription;
	
	
	@Column(name="price")
	float price;
	
	public Product(int product_id, String category , String name,String discription, float price) {
		
		this.product_id = product_id;
		this.category = category;
		this.name = name;
		this.discription=discription;
		this.price = price;
	}
	public Product() {
		
	}
	public int getId() {
		return product_id;
	}
	public void setId(int product_id) {
		this.product_id = product_id;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getdiscription() {
		return discription;
	}
	public void setdiscription(String discription) {
		this.discription = discription;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(String category, String name,String discription, float price) {
		
		this.category = category;
		this.name = name;
		this.discription=discription;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [produtc_id=" + product_id + ", category=" + category + ", name=" + name + ",discription="+discription +", price=" + price + "]";
	}
	
	
	
	
	

}
