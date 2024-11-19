package ru.topacademy.spring_expensetracker;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.*;

@Entity
public class Product {
	@Id
	@GeneratedValue
	Long id;
	
	String name;
	
	@ManyToOne
    @JoinColumn(name="category_id")
	Category category;
	
	@ColumnDefault("0")
	Long price;
	
	@ColumnDefault("0")
	Long quantity;
	
	public Product(String name, Category category, Long price, Long quantity) {
	
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
	
	}
	
	public String getName() {
		return name;
	}
	public Category getCategory() {
		return category;
	}
	public Long getPrice() {
		return price;
	}
	public Long getQuantity() {
		return quantity;
	}
	
}
