package com.cu.Javatest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class BasicTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String a= "18611280300|02125439|443977HYyO|31933|121|354438061190496|206|02125441426949|1271|32267|6|200|0|460011281612129|http://a1.mzstatic.com/us/r30/Purple/v4/fe/30/09/fe300903-df27-41ac-1b0a-5209cf746f38/icon320x320.jpeg|0||011|0110|10.28.19.240|211.90.28.26|10.101.64.82|10.100.36.252|61014|80|AppStore/2.0 iOS/8.1.3 model/iPhone7,1 build/12B466 (6; dt:107)|image/jpeg";
//		//a = a.replaceAll("\\s*","");
//		String [] ba = a.split("\\|",2);
//	for(String c:ba)
//		System.out.println(c);

//		Date date=new Date();
//		  DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
//		  String time=format.format(date);//time就是当前时间
//		System.out.println(time);
		
	String b = "1861128030020151105154934";	
	String c= b.substring(b.length()-2);
	b= b.substring(0,b.length()-2);
	System.out.println(b);
		
	}

}
