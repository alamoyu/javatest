package com.cu.test1209;

import java.io.Serializable;

public class Person  implements Serializable {
	
	
	
	private int age;
	private String name;
	
	public Person(){
		super();
	}
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
}


class Student implements Serializable{

	
}
