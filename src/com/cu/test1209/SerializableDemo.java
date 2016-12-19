package com.cu.test1209;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws Exception {
		
		Person p = new Person(30,"yangyu");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		oos.writeObject(p);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		
		Object obj = ois.readObject();
		
		System.out.println(obj);
		ois.close();
		
	}
	
	
}
