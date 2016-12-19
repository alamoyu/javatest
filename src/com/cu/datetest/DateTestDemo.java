package com.cu.datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTestDemo {
	public static void main(String[] args) throws ParseException {
		String ds = "2016-11-15 10:20:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = sdf.parse(ds);
		
		System.out.println(d);
		
		
		  String str = "2009-02-15 09:21:35.345";
	      SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��SSS����");
	      Date date = sdf1.parse(str);//��ȡ��ʽ�е�����
	      System.out.println("ת��֮ǰ�����ڣ�"+date);
	      
	      
//	      String newStr = sdf2.format(date); //�ı��ʽ
//	      System.out.println("ת��֮������ڣ�"+newStr);
	}
}
