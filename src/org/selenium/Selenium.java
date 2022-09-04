package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium{

	public static void main(String[] args){
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SURIYA\\eclipse-workspace\\Selenimu6\\driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
       WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
       user.sendKeys("tdfwfey");
       
       WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
       pass.sendKeys("335566");
       
       String tagName = user.getTagName();
       
       System.out.println(tagName);
       
       String attribute = user.getAttribute("user");
       System.out.println(attribute);
       
       
       
       
       String t1 = user.getText();
       System.out.println(t1);
       
       String t2 = pass.getText();
       System.out.println(t2);
}
}