package com.cu.filetest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FieReaderDemo {

	public static void main(String[] args){
		
	
		//FileReader不能按行读
//		String	rS = method();
//		System.out.println(rS);
		
		//BufferedReader可以按照行读
		String	rS = method2();
		System.out.println(rS);
		
	}

	private static String method2(){	
		BufferedReader br = null;
		StringBuffer stringBuffer = new StringBuffer();
		try{
		br = new BufferedReader(new FileReader(new File("a.txt")));
		
		String line = null;
		while( (line=br.readLine())!=null ){
			stringBuffer.append(line);
			stringBuffer.append("--");
		}
		
		br.close();
		return stringBuffer.toString();
		}
		catch (IOException e){
			e.printStackTrace();
			return null;
		}
		finally{
			IOUtils.close(br);
			
		}
		
	}
	
	private static String method()  {
		// TODO Auto-generated method stub
		File f = new File("a.txt");
		FileReader fr = null;
		 StringBuffer buffer = new StringBuffer();
//         char data[] = new char[1024];
//         int count = 0;
		try{
			fr = new FileReader(f);
			
//			while(count!=-1){
//				count = fr.read(data);
//				buffer.append(data);
//			}
//			
			int ch ;
			while((ch=fr.read())!=-1){
				buffer.append((char)ch);
			}
			
			return buffer.toString();
		   }
	   catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			  IOUtils.close(fr);	 
		}
		 return null;
	}
}
