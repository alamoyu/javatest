package com.cu.Javatest;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.Iterator ;
import java.util.List;

abstract class Person{
	 String name;
	public Person(String n){
		
		this.name = n;
	}
	public abstract String getName();
	public void modifyName(){
		this.name = this.name+"is you";
	}
}

class Student extends Person{
	 String ke;
	public Student(String k,String n){
		super(n);
		this.ke = k;
	}
	public String getKe(){
		return this.ke;
	}
	@Override
	public String getName(){
		return this.name;
	}
	//overwirte...
	public String modifyName(int b){
		
		return "aaa";
	}
	
}
class Manager extends Person{
	 int salary;
	public Manager(String n, int s){
		super(n);
		this.salary = s;
	}
	public final static PrintStream out = null;
	@Override
	public String getName(){
		return this.name;
	}
}


public final class Inherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int []{1,2,3};
		
		   Pattern SPACE = Pattern.compile("\\|");
		   String [] str = SPACE.split("186|dd|20");
		  String rstr = str[0]+"|"+str[2];
		  List<String> b = new ArrayList<String>();	  
		  b.add(rstr);
		  Iterator iter  = b.iterator();
		 

		  while(iter.hasNext()){
			  System.out.println(iter.next());
		  }
		 Person p = new Student("r","shuxue");
		 Student s = new Student("r","shuxue");
		 s.ke =  s.ke +"yuwen";
		
		 p = new Manager("rrr", 12);
		

		 System.out.println(p.name);
		 System.out.println();
	}

}
