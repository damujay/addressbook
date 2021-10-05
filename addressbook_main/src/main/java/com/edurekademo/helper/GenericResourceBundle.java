package com.edurekademo.helper;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class GenericResourceBundle {
	public static String getProperties(String source){
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle");
	        System.out.println("=====This is Github repo polling=====");
		Enumeration <String> keys = rb.getKeys();
		String value="";
		while (keys.hasMoreElements()) {
			
			String key =  keys.nextElement();
			
			if(key.equalsIgnoreCase(source)){
				value = rb.getString(key);
			}
		}
			        System.out.println("=====This is Github repo polling end=====");

		return value;
	}
	
}

