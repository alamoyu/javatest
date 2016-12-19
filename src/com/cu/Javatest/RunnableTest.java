package com.cu.Javatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



class Producer implements Runnable{
	private String name;
	public Producer(String name){
		super();
		this.name = name;
	}
	
	public void run(){
		
		int i = 0;
		for(;i<3;i++){
			System.out.println(name+i);
		}
	}
}
class ProducerThread extends Thread{
	
	private String name;
	public ProducerThread(String name){
		super();
		this.name = name;
	}
	public void run(){
		int i = 0;
		for(i=0;i<3;i++){
			System.out.println(name+i);
		}
	}
}



public class RunnableTest{
	
	
	public static void main(String args[]){
//		Thread t = new Thread(new Producer("线程1"));
//		t.start();
		
		
		ProducerThread pt = new ProducerThread("线程2");
		pt.start();
		
		Properties props = new Properties();
		String propFile = "G:\\pros.txt";
		try {
		props.load(new FileInputStream(new File(propFile)));
		 String age = props.getProperty("age");
		 System.out.println(age + " = " + age);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}