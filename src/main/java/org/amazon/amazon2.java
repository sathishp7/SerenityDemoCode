package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class amazon2 {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		//ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();


		 driver.findElement(By.id("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Actions a=new Actions(driver);
		
		 WebElement hover = driver.findElement(By.xpath("//div[text()='Fashion']"));
		 a.moveToElement(hover).perform();
		 
		 
		 
		 
	}
}
