package com.cu.Javatest;

import java.io.FileNotFoundException;

class UseThrow{
	
	public void pop ()throws NegativeArraySizeException{
		
		int [] a = new int[-3];
		System.out.println(a[1]);
	}
	public void callpop(){
		try{
		pop();
		}
		catch(NullPointerException e){
			System.out.println("pop“Ï≥£");
		}
		System.out.println("over");
	}
	
}


public class CUExcepetion {

	/**
	 * @param args
	 */
	
	public void basic(){
		
		
		try{
			int age = Integer.parseInt("aa20");
			System.out.println(age);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("over");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CUExcepetion a = new CUExcepetion();
		//a.basic();
		UseThrow u = new UseThrow();
		u.callpop();
	}

}
