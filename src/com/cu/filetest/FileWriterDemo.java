package com.cu.filetest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String [] args){
		File f = new File("a.txt");
		try{
		FileWriter fw = new FileWriter(f);
		fw.write("hello worlds");
		fw.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
