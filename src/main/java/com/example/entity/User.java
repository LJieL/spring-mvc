package com.example.entity;

import lombok.Data;

@Data
public class User {
	private String name;
	private int id;
	private int age;
	
	
	
	public User(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		
	}
	
	
}
