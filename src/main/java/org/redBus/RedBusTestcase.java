package org.redBus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTestcase {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://redbus.in/");
	driver.manage().window().maximize();
			driver.findElement(By.id("src")).sendKeys("Chennai");
			driver.findElement(By.xpath("(//li[contains(text(),'Chennai')])[1]")).click();
			driver.findElement(By.id("dest")).sendKeys("Bangalore");
			driver.findElement(By.xpath("(//li[contains(text(),'Bangalore')])[1]")).click();
			driver.findElement(By.xpath("//tr/td[text()='17']")).click();
			driver.findElement(By.id("search_btn")).click();
			WebElement numOfBusResult = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
			System.out.println("Number of buses displayed: "+ numOfBusResult.getText());
			driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
			WebElement secondBus = driver.findElement(By.xpath("(//div[@class='clearfix bus-item-details'])[2]//div[@class='travels lh-24 f-bold d-color']"));
			System.out.println("Second Bus: " +secondBus.getText());
			System.out.println("Title: " +driver.getTitle());
			
			
}
}
