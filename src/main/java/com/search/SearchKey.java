package com.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchKey {
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://beta.roadrunnersports.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@class='textbox-input--1p_rz  textbox-input-toggle-off--S7FMz']"));
		search.click();
		search.sendKeys("34519",Keys.ENTER);
	
		Thread.sleep(5000);
		//WebElement plp = driver.findElement(By.xpath("//span[@class='breadcrumb-line---rKHZ']")).isDisplayed();
		/*
		 * Boolean displayed=false; try {
		 * if(driver.findElement(By.xpath("//span[@class='breadcrumb-line---rKHZ']")).
		 * isDisplayed()==true) { System.out.println("TRUE"); }} catch(Exception ex) {
		 * driver.navigate().refresh(); WebElement search1 = driver.findElement(By.
		 * xpath("//input[@class='textbox-input--1p_rz  textbox-input-toggle-off--S7FMz']"
		 * )); search1.click(); search1.sendKeys("34519",Keys.ENTER);
		 * 
		 * }
		 */	
		
		int size = driver.findElements(By.xpath("//span[@class='breadcrumb-line---rKHZ']")).size();
	if(size==0) {
		System.out.println(size);
		driver.navigate().refresh(); 
		WebElement search1 = driver.findElement(By.xpath("//input[@class='textbox-input--1p_rz  textbox-input-toggle-off--S7FMz']")); 
		search1.click(); 
		search1.sendKeys("34519",Keys.ENTER);
		
	}
		
		
	}


}
