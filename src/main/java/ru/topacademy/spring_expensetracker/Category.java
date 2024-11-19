package ru.topacademy.spring_expensetracker;

import jakarta.persistence.*;

@Entity
public class Category {
	@GeneratedValue
	@Id
	Long id;
	
	@Column(nullable=false)
	String name;

	public Category(String _name) {
		name = _name;
	}

	public Category() {
	}
	
	public String getName(String name)
	{
		return name;
	}
	
	
}
