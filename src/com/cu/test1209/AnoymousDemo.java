package com.cu.test1209;

 abstract class Animal{

	public abstract int runDistance();
}
 
class AnmialTools{
	
	public void show(Animal a){
		System.out.println("Animalƒ‹≈‹"+a.runDistance());
	}
	
}
 
 

public class AnoymousDemo {
public static void main(String[] args) {
	
	AnmialTools a= new AnmialTools(); 
	
	a.show(
			new Animal(){
				
				public int runDistance(){return 1000;}
			}
			
			
			);
	
}
}
