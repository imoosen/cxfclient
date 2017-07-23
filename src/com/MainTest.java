package com;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.TranslatorWebService;
import cn.com.webxml.TranslatorWebServiceSoap;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;
import service.FirstService;
import service.FirstServiceService;
import service.User;

public class MainTest {
	
	public static void main(String[] args) {
		
		FirstServiceService fs = new FirstServiceService();
		FirstService service = fs.getFirstServicePort();
		String print = service.print();
		System.out.println(print);
		
		int sum = service.getSum(3, 4);
		System.out.println(sum);
		
		User u = new User();
		u = service.verifyName("doudou");
		System.out.println(u.getUsername());
		//testCity();
		testEnglish();
	}
	
	public static void testCity(){
		WeatherWebService wws = new WeatherWebService();  
        WeatherWebServiceSoap wwsp = wws.getWeatherWebServiceSoap();  
          
        ArrayOfString aos = wwsp.getWeatherbyCityName("上海");  
          
        for (String s : aos.getString()) {     
            System.out.println(s);  
        }  
	}
	public static void testEnglish(){
		TranslatorWebService tsw = new TranslatorWebService();
		TranslatorWebServiceSoap ts = tsw.getTranslatorWebServiceSoap();
		ArrayOfString eng = ts.getEnCnTwoWayTranslator("正常的");
		for (String s : eng.getString()) {
			System.out.println(s);
		}
	}
}
