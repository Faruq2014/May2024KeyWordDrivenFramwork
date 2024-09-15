package com.facebook_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestReader {
	
	Properties prop; //instance variable
	
	public TestReader(){
		 prop = new Properties();// Properties class only able to read
		 
		 
			String filePath="src/test/resources/Test.properties";
			FileInputStream fis;
		try {
			 fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public String readBrowser() {
		return prop.getProperty("Browser");
				 
	}
	
	public String readUrl() {
		return prop.getProperty("url");
	}
	
	public String readuserName() {
		return prop.getProperty("userName");
	}
	
	public String readPassword() {
		return prop.getProperty("password");
	}

  

	public static void main(String[] args) {
		TestReader ap=new TestReader();
		System.out.println(ap.readBrowser());
		System.out.println(ap.readUrl());

	}

}
