package com.cu.Javatest;

abstract class Animal{
	public abstract void eat();	
	public abstract void cry();	
}

class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("Ã¨³ÔÓã");
		
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("ß÷ß÷ß÷");
	}
	
}

class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("¹·³ÔÈâ");
		
	}

	@Override
	public void cry() {
		System.out.println("ÍôÍôÍô");
	}
}

public class InstanceOfDemo {
	public static void main(String[] args){
		Animal a = new Dog();
		System.out.println(a instanceof Animal );
		System.out.println(a instanceof Dog);
		a = new Cat();
		System.out.println(a instanceof Animal );
		System.out.println(a instanceof Dog);
		if(a instanceof Dog)
		{Dog d  = (Dog)a;
			System.out.println("d is dog ");
		}
	}
}
