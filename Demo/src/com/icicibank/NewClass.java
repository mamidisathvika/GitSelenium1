package com.icicibank;	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver" , "E:\\SeleniumDrivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in");
		
		
		//WebDriver driver1 = new FirefoxDriver();
	}

}
