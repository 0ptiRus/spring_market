package ru.topacademy.spring_expensetracker;

import java.util.Date;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.*;

@Entity
public class Order {
	@GeneratedValue
	@Id
	Long id;
	
	@Column(nullable=false)
	String customer_name;
	
	Date order_date;
	
	@ColumnDefault("0")
	Long total;
}
