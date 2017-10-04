package com.icicibank;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		List<WebElement> var =  driver.findElements(By.xpath("//ul[@class='sbsb_b']/li/div/div[@class='sbqs_c']"));
		for(WebElement itr : var)
		{
			if(itr.getText().equals("selenium"))
			{
			itr.click();
			return;
			}
		}
		
		
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='Google Search']")))).click();
		
		
		//driver.close();
	}
}