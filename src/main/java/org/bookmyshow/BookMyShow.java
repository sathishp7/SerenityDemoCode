package org.bookmyshow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {
public static void main(String[] args) throws Exception {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	ChromeOptions option= new ChromeOptions();
    option.addArguments("--disable-notification");
	driver.get("https://in.bookmyshow.com/");
	driver.findElement(By.xpath("//span[text()='Chennai']")).click();
	WebElement locationConfirm = driver.findElement(By.xpath("//span[text()='Chennai']"));
	boolean displayed = locationConfirm.isDisplayed();
	if(displayed==true) {
		System.out.println("Chennai is displayed");
	}else {
		System.out.println("Chennai is not displayed");
}
	WebElement search = driver.findElement(By.xpath("//span[contains(text(),'Search for Movies, Events, Plays')]"));
search.click();
driver.findElement(By.xpath("//span[text()='Tamil']")).click();
driver.findElement(By.linkText("Vaathi (U)")).click();
WebElement theatre = driver.findElement(By.xpath("(//div[@class='__title']/a[@class='__venue-name'])[1]"));
System.out.println("FirstTheatre Name: " +theatre.getText());
	driver.findElement(By.xpath("(//div[text()='INFO'])[1]")).click();
boolean checkParking = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]")).isDisplayed();
if (checkParking==true) {
	System.out.println("Parking is displayed");
}else {
	System.out.println("Parking is not displayed");
}
driver.findElement(By.xpath("//div[@class='cross-container']")).click();
driver.findElement(By.xpath("(//div[contains(text(),'09:00 AM')])[1]")).click();
driver.findElement(By.id("btnPopupAccept")).click();
driver.findElement(By.xpath("//li[@id='pop_1']")).click();
driver.findElement(By.id("proceed-Qty")).click();
driver.findElement(By.xpath("//div[@id='A_8_0112']/a[contains(text(),'11')]")).click();
driver.findElement(By.id("btmcntbook")).click();
Thread.sleep(3000);
WebElement subTotal = driver.findElement(By.xpath("//span[text()='Rs.185.40']"));
System.out.println("SubTotal: " +subTotal.getText());
	
}
}
