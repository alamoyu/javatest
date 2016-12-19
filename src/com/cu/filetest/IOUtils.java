package com.cu.filetest;

import java.io.IOException;
import java.io.Reader;
public class IOUtils {

	private IOUtils(){
		
	}
	
	public static boolean close(Reader isr){
		
	
			try {
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return true;
	}
	
}
