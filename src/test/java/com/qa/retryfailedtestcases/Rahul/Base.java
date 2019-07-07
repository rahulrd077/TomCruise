package com.qa.retryfailedtestcases.Rahul;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	//Base file
	static WebDriver driver;
	
	
public  void initialization() {
	System.setProperty("webdriver.chrome.driver","D:\\Chrome driver for version 74\\chromedriver.exe");
	driver = new ChromeDriver();
	 
	
	driver.get("http://www.google.com");
	
}

      public  void Failed(String methodName) throws Exception {
    	  
    	 
    	
    
    	  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    	
    	
    	File destFile = new File("D:\\Eclipse Workspace\\Rahul\\Screenshots\\rahul"+methodName+"_.jpg");
    	
    	FileUtils.copyFile(srcFile, destFile);
     

      }
}
