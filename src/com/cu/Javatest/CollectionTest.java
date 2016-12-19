package com.cu.Javatest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//父类对象由子类实例化
public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c  =  new ArrayList<String>();
		c.add("ff");
		c.add("gg");
		Iterator<String> it = c.iterator();
		while (it.hasNext()){
			String dd = it.next();
			System.out.println(dd);		
		}
		
		for(String dd:c){
			System.out.println(dd);		
		}
		
	}
	
}
