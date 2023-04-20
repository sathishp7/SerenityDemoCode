package com.search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonSearch {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
	
	driver.get("https://www.amazon.in/ref=na        v_logo");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes" + Keys.ENTER);
	System.out.println("************");
	Thread.sleep(10000);
	try
	{
		boolean isSort = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']/span")).isDisplayed();
		//String text = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']/span")).getText();	
		
	
			driver.findElement(By.id("a-autoid-0-announce")).click();
			driver.findElement(By.xpath("//div[@class='a-popover-inner']/ul/li[4]")).click();
		
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	driver.navigate().refresh();				
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes" + Keys.ENTER);
	driver.findElement(By.id("a-autoid-0-announce")).click();
	driver.findElement(By.xpath("//div[@class='a-popover-inner']/ul/li[4]")).click();
	}
}
}
