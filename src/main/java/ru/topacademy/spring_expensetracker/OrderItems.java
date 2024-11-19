package ru.topacademy.spring_expensetracker;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.*;

@Entity
public class OrderItems {
	@GeneratedValue
	@Id
	Long id;
	
	@ManyToMany
	@JoinColumn(name="order_id")
	Order order;
	
	@ManyToMany
	@JoinColumn(name="product_id")
	Product product;
	
	@ColumnDefault("0")
	Long quantity;
}
