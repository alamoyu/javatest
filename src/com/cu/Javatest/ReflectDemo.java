package com.cu.Javatest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.cu.database.Traffic;
/**
 * date: 2016-12-13
 * @author rainblue
 *
 */
public class ReflectDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		// TODO Auto-generated method stub
		//通过对象获取类的字节码地址
		Manager a  = new Manager("yangyu", 20000);
		Class c1 = a.getClass();
		
		//通过类获取
		Class c2 = Manager.class;
		
		
		System.out.println(c1==c2); //True
		
		//其实还可以通过配置文件获取
		Properties pop  = new Properties();
		FileReader fr = new FileReader("test.properties");
		pop.load(fr);
		fr.close();
		
		String className = pop.getProperty("className");
		String methodName = pop.getProperty("method");
		
		Class c = Class.forName(className);
		Constructor  con = c.getConstructor(int.class,String.class);
		
		Object obj = con.newInstance(12,"yangyu");
		
		Method m = c.getMethod(methodName,null);
		
		m.invoke(obj, null);
		

		

	}

}
