package com.cu.filetest;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Exception;
/*
 * canRead() 
 * canWrite() 

 * boolean renameTo(File dest) 
          重新命名此抽象路径名表示的文件。 
 */
import java.io.FileReader;

public class FileDemo {

	public static void main(String[] args){

		method1();
		method();
	}

	private static void method() {
		// TODO Auto-generated method stub
//		File f = new File("z:\\");
//		File [] ff = f.listFiles() ;
//		for(File fe:ff){
//			System.out.println(fe.toString());
//		}
	}

	private static void method1()  {
		// TODO Auto-generated method stub
		File f = new File("a.txt");
//		System.out.println(f.canRead());
//		System.out.println(f.canWrite());
//		System.out.println(f.toString());
//		System.out.println(f.getAbsolutePath() );
		File fr = new File("b.txt");
		try {
			FileReader fread = new FileReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("file rename"+f.renameTo(fr));
	}
	
}
